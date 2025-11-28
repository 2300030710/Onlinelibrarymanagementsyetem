# Use Nginx to serve static files
FROM nginx:alpine

WORKDIR /usr/share/nginx/html

# Remove default Nginx files
RUN rm -rf ./*

# Copy project files
COPY . .

# Expose port 80
EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]
