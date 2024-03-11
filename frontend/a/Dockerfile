FROM node:alpine
WORKDIR /app
COPY . /app
RUN npm install -g @angular/cli
RUN npm install

ADD nginx-default.conf /etc/nginx/nginx-default.conf

EXPOSE 4200

CMD ["ng", "serve", "--host", "0.0.0.0", "--disable-host-check"]