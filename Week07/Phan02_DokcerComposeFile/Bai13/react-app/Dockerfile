FROM node:22.6.0

WORKDIR /app

COPY package*.json ./
RUN npm install

COPY . .
RUN npm run build
