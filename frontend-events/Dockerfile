# Use official Node image as the base image
FROM node:20.10.0 AS builder

# Set the working directory inside the container
WORKDIR /app

# Copy package.json and package-lock.json to the working directory
COPY package*.json ./

# Install dependencies
RUN npm install

# Copy the entire project to the working directory
COPY . .

# Build the Angular app
RUN npm run build --prod

# Use NGINX as the production server
FROM nginx:latest

# Copy the built artifacts from the builder stage to the NGINX public directory
COPY --from=builder /app/dist/frontend-events /usr/share/nginx/html

# Expose port 80
EXPOSE 80

# Start NGINX
CMD ["nginx", "-g", "daemon off;"]
