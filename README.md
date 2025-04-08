
# Task Manager Full-Stack Application

This repo contains my Task Manager full-stack app. The frontend is built with Angular, and the backend is powered by Spring Boot. The app also integrates with a database for storing tasks.

## How to Run Backend & Frontend

### Backend Setup

1. **Clone the repository:**
   First, clone this repo to your local machine:
   ```bash
   git clone https://github.com/your-username/task-manager.git
   cd task-manager
   ```

2. **Install dependencies:**
   Make sure you have Java 11+ and Maven installed. To install the required dependencies, run:
   ```bash
   mvn install
   ```

3. **Run the backend:**
   You can start the Spring Boot app by running:
   ```bash
   mvn spring-boot:run
   ```
   This will start the backend server on `http://localhost:8080`.

4. **Access the API:**
   Once the backend is up and running, you can make requests to the API at `http://localhost:8080/api/`.

### Frontend Setup

1. **Install Node.js:**
   If you haven’t already, make sure to install [Node.js](https://nodejs.org/) (version 14 or higher).

2. **Navigate to the frontend folder:**
   Change to the frontend directory:
   ```bash
   cd frontend
   ```

3. **Install dependencies:**
   Run the following command to install all necessary dependencies:
   ```bash
   npm install
   ```

4. **Run the frontend:**
   To start the Angular frontend, use:
   ```bash
   ng serve
   ```
   The frontend will run on `http://localhost:4200`.


## Database Setup

For this app, I’m using [MySQL](https://www.mysql.com/), but you can use any other relational database.

1. **Create the database:**
   First, you need to create a database. You can use a MySQL client MySQL Workbench or run the following SQL command:
   ```sql
   CREATE DATABASE task_manager;
   ```

2. **Configure database connection:**
   In the `application.properties` file under `src/main/resources/`, configure the connection to your database:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/task_manager
   spring.datasource.username=your-username
   spring.datasource.password=your-password
   spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
   ```

That’s it! You should now be able to run both the backend and frontend locally and interact with the app.

---

Let me know if you have any questions or run into issues!
```
