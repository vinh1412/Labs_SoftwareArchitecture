# Sử dụng Node.js 18 làm base image
FROM node:18
# Thiết lập thư mục làm việc trong container
WORKDIR /app
# Sao chép package.json và package-lock.json vào thư mục làm việc
COPY package*.json ./
# Cài đặt các phụ thuộc
RUN npm install
# Sao chép toàn bộ mã nguồn vào thư mục làm việc
COPY . .
# Mở cổng 3000 để ứng dụng có thể truy cập từ bên ngoài
EXPOSE 3000
# Chạy ứng dụng khi container khởi động
CMD ["npm", "start"]