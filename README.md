# S4.01 — Spring Boot Introduction

The purpose of this assignment is to provide an initial introduction to the Spring Boot framework, the HTTP protocol, the creation of REST APIs, and the use of dependency managers such as Maven and Gradle.

## Features
- **User Creation**: Register new users with unique identifiers (UUID).
- **Global Retrieval**: List all registered users in the system.
- **Search Logic**: Filter users by name through advanced query parameters.
- **Single User Detail**: Access specific user data via ID.
- **Health Monitoring**: Includes a dedicated `/health` endpoint to monitor application status.
- **Error Handling**: Custom exceptions for improved debugging and user feedback (e.g., `UserNotFoundException`).

## API Endpoints
| Method | Endpoint | Description |
| :--- | :--- | :--- |
| `GET` | `/health` | Check application health status. |
| `GET` | `/users` | Get all users (Optional query param: `?name=...`). |
| `POST` | `/users` | Create a new user. |
| `GET` | `/users/{id}` | Get a specific user by UUID. |

## Technologies
- **Backend**: Java 21, Spring Boot 3.x
- **Tools**: Maven, JUnit, Mockito

## Installation and Execution
1. **Clone the repository**:
   ```bash
   git clone https://github.com/carlasalmeron/S4.01-SpringBoot-Introduction.git
   ```
2. **Environment variables**:
   Create a `.env` file or update `src/main/resources/application.properties` with your database credentials:
   ```properties
   # Example configuration
   SPRING_DATASOURCE_URL=jdbc:mysql://localhost:3306/userdb
   SPRING_DATASOURCE_USERNAME=root
   SPRING_DATASOURCE_PASSWORD=yourpassword
   SPRING_DATA_MONGODB_URI=mongodb://localhost:27017/userdb
   ```
3. **Execution of the application**:
   Use the Maven wrapper to run the project:
   ```bash
   ./mvnw spring-boot:run
   ```
4. **Tests**:
   To execute the unit and integration tests:
   ```bash
   ./mvnw test
   ```
