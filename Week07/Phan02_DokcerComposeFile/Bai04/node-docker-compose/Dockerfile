# Sử dụng image Node.js chính thức
FROM node:22.6.0

# Đặt thư mục làm việc trong container
WORKDIR /app

# Sao chép package.json và package-lock.json từ thư mục của bạn (máy host) vào thư mục /app trong container
COPY package*.json ./

# Cài đặt dependencies
RUN npm install

# Sao chép toàn bộ mã nguồn của bạn từ máy host vào thư mục /app trong container.
COPY . .

# Mở cổng 3000
EXPOSE 3000

# Chạy ứng dụng
CMD ["node", "index.js"]