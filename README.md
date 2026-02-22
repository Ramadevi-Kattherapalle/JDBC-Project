# JDBC-Project – JDBC CRUD & Advanced Database Operations (Java)

A professional Java project demonstrating core and advanced JDBC concepts including CRUD operations, Batch Processing, PreparedStatement, Statement, and CallableStatement with PostgreSQL database integration.

This project is designed as a hands-on learning resource to understand how Java interacts with relational databases using JDBC API.

---

## 📌 Project Overview

**JDBC_pro** is a structured Java application that showcases different approaches to perform database operations using JDBC.
It covers basic to advanced concepts such as:

* CRUD operations using Statement and PreparedStatement
* Batch execution for performance optimization
* Stored Procedure execution using CallableStatement
* PostgreSQL JDBC driver integration

This project is ideal for beginners and learners preparing for Java Full Stack and Database-related roles.

---

## 🏗️ Project Architecture

The project follows a modular structure where each package demonstrates a specific JDBC concept:

* Statement → Basic CRUD operations
* PreparedStatement → Secure and efficient CRUD
* BatchExecution → Bulk database operations
* CallableStatement → Stored procedure execution

---

## 📂 Project Structure

```id="gk1r4x"
JDBC_pro/
|
|-- src/
|   |
|   |-- BatchExecution/
|   |   |-- BatchExe_PreparedStatement.java
|   |   |-- BatchExe_Statement.java
|   |
|   |-- CallableStatement/
|   |   |-- CallableStatement_procedure.java
|   |
|   |-- PreparedStatement/
|   |   |-- PreparedStatement_With_CRUD.java
|   |
|   |-- Statement/
|       |-- Statement_With_CRUD.java
|
|-- Referenced Libraries/
|   |-- postgresql-42.7.8.jar
|
|-- README.md
```

---

## 🚀 Key Features

* Full CRUD Operations (Create, Read, Update, Delete)
* Batch Execution using Statement and PreparedStatement
* Stored Procedure execution using CallableStatement
* Secure queries using PreparedStatement (Prevents SQL Injection)
* PostgreSQL database connectivity
* Well-structured package-wise JDBC examples
* Beginner-friendly and interview-oriented code

---

## 🛠️ Technologies Used

* **Programming Language:** Java (JDK 8+)
* **Database:** PostgreSQL
* **API:** JDBC (Java Database Connectivity)
* **Driver:** PostgreSQL JDBC Driver (postgresql-42.7.8.jar)
* **IDE:** Eclipse / STS / IntelliJ IDEA

---

## ⚙️ Prerequisites

Before running this project, ensure you have:

* Java JDK 8 or above installed
* PostgreSQL Database installed and running
* PostgreSQL JDBC Driver (already included in Referenced Libraries)
* Any Java IDE (Eclipse, STS, IntelliJ)
* Basic knowledge of SQL and JDBC

---

## 🔧 Database Configuration

Update the database connection details inside the Java files:

```java id="s8k2l9"
String url = "jdbc:postgresql://localhost:5432/your_database";
String username = "your_username";
String password = "your_password";
```

Make sure:

* PostgreSQL server is running
* Database and tables are created before execution

---

## ▶️ How to Run the Project

### 1️⃣ Clone the Repository

```bash id="l3n7p2"
git clone https://github.com/your-username/JDBC_pro.git
```

### 2️⃣ Import into IDE

* Open Eclipse / STS
* Click: File → Import → Existing Java Project
* Select the JDBC_pro folder

### 3️⃣ Add JDBC Driver (If not auto-detected)

* Right Click Project → Build Path → Configure Build Path
* Add External JAR → Select `postgresql-42.7.8.jar`

### 4️⃣ Create Database & Tables

Create required tables in PostgreSQL before executing CRUD operations.

### 5️⃣ Run the Java Classes

Run any class based on functionality:

* `Statement_With_CRUD.java` → Basic CRUD using Statement
* `PreparedStatement_With_CRUD.java` → CRUD using PreparedStatement
* `BatchExe_Statement.java` → Batch operations using Statement
* `BatchExe_PreparedStatement.java` → Batch operations using PreparedStatement
* `CallableStatement_procedure.java` → Stored Procedure execution

---

## 📊 Module Explanation

### 🔹 Statement Package

Performs CRUD operations using `Statement` and demonstrates the use of `execute()` method.

### 🔹 PreparedStatement Package

Implements secure and efficient CRUD operations using parameterized queries.

### 🔹 BatchExecution Package

Handles multiple SQL operations in a single batch to improve performance and reduce database round trips.

### 🔹 CallableStatement Package

Demonstrates how to call a stored procedure (`insert_sport`) using `CallableStatement`.

---

## 🔐 Best Practices Implemented

* Use of PreparedStatement to prevent SQL Injection
* Batch processing for optimized performance
* Proper separation of concepts into packages
* Clean and readable code structure
* Reusable database connection logic (can be extended)

---

## 👩‍💻 Author

**Ramadevi Kattherapalle**
Java Developer | JDBC | Hibernate | JPA | Full Stack Learner

---

## 📜 License

This project is developed for educational and learning purposes to demonstrate core and advanced JDBC operations using Java and PostgreSQL.
