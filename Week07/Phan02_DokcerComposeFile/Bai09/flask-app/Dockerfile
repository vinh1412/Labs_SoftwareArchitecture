# Sử dụng image chính thức của Python
FROM python:3.9-slim

# Cài đặt các thư viện cần thiết
WORKDIR /app
COPY requirements.txt /app/
RUN pip install --no-cache-dir -r requirements.txt

# Sao chép mã nguồn vào container
COPY . /app

# Chạy ứng dụng Flask
CMD ["python", "app.py"]
