FROM node:18-alpine

COPY package*.json ./
COPY app.js ./

RUN npm ci

EXPOSE 8090
CMD ["node", "app.js"]
