var express = require("express");
var app = express();
app.get("/", function (req, res) {
  res.send("<h1>Hello, Docker!</h1>");
});
app.listen(3000, function () {
  console.log("Server is running on http://localhost:3000");
});
