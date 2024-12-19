# Car Management System

This project is a Spring Boot application designed for managing cars. It includes features like global search, pagination, sorting, input validation, API documentation, and deployment readiness.

## Features

1. **Global Search**: Search cars by name, model, year, color, or fuel type.
2. **Pagination & Sorting**: Handle large datasets efficiently.
3. **Input Validation**: Ensure proper data submission.
4. **API Documentation**: Swagger/OpenAPI integration for easy testing.
5. **API Hosting**: Ready for deployment on cloud platforms like AWS or Azure.

## Prerequisites

- Java JDK 11 or higher
- Maven
- MySQL database
- An IDE (e.g., IntelliJ IDEA or Eclipse)

Configure the Database
Create a Database:
Open your MySQL Workbench (or similar tool).
Create a database named car_management:
sql
Copy code
CREATE DATABASE car_management;

## Setup Instructions

1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd car-management-system
   ```

2. Configure the database:
   - Create a MySQL database named `car_management`.
   - Update `application.properties`:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/car_management
     spring.datasource.username=your_db_username
     spring.datasource.password=your_db_password
     spring.jpa.hibernate.ddl-auto=update
     spring.jpa.show-sql=true
     springdoc.api-docs.enabled=true
     ```

3. Build and run the application:
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

4. Access the application:
   - Swagger UI: [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## API Endpoints

### 1. Get All Cars
- **URL**: `GET /api/cars`
- **Description**: Retrieves a list of all cars.

### 2. Search Cars
- **URL**: `GET /api/cars/search`
- **Query Params**:
  - `keyword` (string): Keyword to search by name, model, color, or fuel type.
- **Example**:
  ```bash
  GET http://localhost:8080/api/cars/search?keyword=Toyota
  ```

### 3. Pagination & Sorting
- **URL**: `GET /api/cars/paged`
- **Query Params**:
  - `page` (int): Page number (default: 0).
  - `size` (int): Number of items per page (default: 10).
  - `sort` (string): Field to sort by (e.g., `name,asc` or `price,desc`).
- **Example**:
  ```bash
  GET http://localhost:8080/api/cars/paged?page=0&size=5&sort=name,asc
  ```

### 4. Get Car by ID
- **URL**: `GET /api/cars/{id}`
- **Path Params**:
  - `id` (long): ID of the car.
- **Example**:
  ```bash
  GET http://localhost:8080/api/cars/1
  ```

### 5. Add a Car
- **URL**: `POST /api/cars`
- **Body**:
  ```json
  {
      "name": "Toyota Corolla",
      "model": "2022",
      "year": 2022,
      "price": 20000.0,
      "color": "White",
      "fuelType": "Petrol"
  }
  ```

### 6. Update a Car
- **URL**: `PUT /api/cars/{id}`
- **Path Params**:
  - `id` (long): ID of the car to update.
- **Body**:
  ```json
  {
      "name": "Honda Civic",
      "model": "2023",
      "year": 2023,
      "price": 25000.0,
      "color": "Black",
      "fuelType": "Petrol"
  }
  ```

### 7. Delete a Car
- **URL**: `DELETE /api/cars/{id}`
- **Path Params**:
  - `id` (long): ID of the car to delete.

## Deployment Instructions

1. Package the application:
   ```bash
   mvn package
   ```

2. Deploy the generated `.jar` file to your chosen cloud platform (e.g., AWS Elastic Beanstalk, Azure App Services).

3. Configure environment variables for database credentials in the cloud environment.

4. Access the hosted API using the provided public URL.

## Testing

Use **Swagger UI** or **Postman** for testing the API endpoints.

### Swagger UI
Visit [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html) to explore and test all endpoints.

### Postman Collection
Import the following endpoints into Postman and test:
- `GET /api/cars`
- `GET /api/cars/search?keyword=...`
- `GET /api/cars/paged?page=...&size=...&sort=...`
- `GET /api/cars/{id}`
- `POST /api/cars`
- `PUT /api/cars/{id}`
- `DELETE /api/cars/{id}`
"# car-management-system" 
