# Use the official Node.js LTS (Long Term Support) image as the base image
FROM node:lts AS builder

# Set the working directory in the container
WORKDIR /app

# Copy the package.json and package-lock.json files to the container
COPY package*.json ./

# Install project dependencies
RUN npm install

# Copy the application source code to the container
COPY . .

# Build the Angular app for production
RUN npm run build --prod

# Use a lightweight base image for serving the application
FROM nginx:stable-alpine

# Copy the built application from the previous stage to the NGINX webroot directory
COPY --from=builder /app/dist /usr/share/nginx/html

# Expose the container's port (default is 80 for NGINX)
EXPOSE 80

# Start NGINX and keep the container running
CMD ["nginx", "-g", "daemon off;"]
