
# Blog Management System

A simple and realistic Blog Management System built using **Spring Boot**, **Thymeleaf**, **MySQL**, and basic **HTML/CSS**.

---

##  Features
- Create, Read, Update, Delete (CRUD) blog posts
- Simple and clean user interface using Thymeleaf templates
- Uses MySQL for database persistence
- Automatically manages database schema using JPA

---
## 🛠 Tech Stack
- **Backend:** Spring Boot, Spring Data JPA
- **Frontend:** Thymeleaf + HTML + CSS
- **Database:** MySQL
- **Build Tool:** Maven


## Project Structure

```java
src/
├── main/
│ ├── java/com/spring/blog_management/
│ │ ├── controller/
│ │ │ └── BlogController.java
│ │ ├── model/
│ │ │ └── BlogPost.java
│ │ ├── repository/
│ │ │ └── BlogRepository.java
│ │ └── service/
│ │ └── BlogService.java
│ ├── resources/
│ │ ├── templates/
│ │ │ ├── index.html
│ │ │ ├── create.html
│ │ │ └── edit.html
│ │ └── application.properties
└── test/

```

---

##  Installation & Running
1. Clone the repository:
    ```bash
    git clone https://github.com/rachitsharma300/blog-management-system.git
    cd blog-management-system
    ```
2. Set up MySQL:
    ```sql
    CREATE DATABASE blogdb;
    ```

    
3. Update `application.properties` with your MySQL credentials.

4. Run the application:
    ```bash
    mvn spring-boot:run
    ```

5. Open in browser:
    ```bash
    http://localhost:8080/blogs
    ```

    
