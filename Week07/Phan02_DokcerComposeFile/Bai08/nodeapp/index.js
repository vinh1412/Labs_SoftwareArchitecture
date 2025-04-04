const express = require("express");
const mysql = require("mysql2");

const app = express();
const port = 3000;

let connection;

function connectWithRetry() {
  connection = mysql.createConnection({
    host: process.env.DB_HOST || "localhost",
    user: process.env.DB_USER || "root",
    password: process.env.DB_PASSWORD || "",
    database: process.env.DB_NAME || "testdb",
  });

  connection.connect((err) => {
    if (err) {
      console.error("Không thể kết nối MySQL:", err.message);
      console.log("Thử kết nối lại sau 5 giây...");
      setTimeout(connectWithRetry, 5000); // Thử lại sau 5 giây
    } else {
      console.log("Đã kết nối MySQL!");

      // Sau khi kết nối thành công thì bắt đầu lắng nghe server
      app.listen(port, () => {
        console.log(`Server đang chạy tại http://localhost:${port}`);
      });
    }
  });
}

// Gọi hàm kết nối lần đầu
connectWithRetry();

// Route test
app.get("/", (req, res) => {
  if (!connection) {
    return res.status(503).send("MySQL chưa sẵn sàng");
  }

  connection.query("SELECT NOW() AS currentTime", (err, results) => {
    if (err) return res.status(500).send("Lỗi truy vấn");
    res.send(`Giờ hiện tại từ MySQL: ${results[0].currentTime}`);
  });
});
