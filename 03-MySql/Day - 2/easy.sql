CREATE DATABASE SCHOOL;
USE SCHOOL;



-- 1. Create a Students table with id, name, course, marks.
CREATE TABLE Students (
id INT,
name VARCHAR(100),
course VARCHAR(100), 
marks INT
);

-- 2. Insert 5 student records.
INSERT INTO Students (id, name, course, marks)
VALUES
(1, 'Rachit', 'JAVA', 98),
(2, 'Rohit', 'C++', 81),
(3, 'Rahul', 'Python', 89),
(4, 'Raushan', 'C#', 88),
(5, 'Rohan', 'DATASCIENCE', 78);

-- 3. Fetch all students who scored more than 75 marks.
SELECT * FROM Students where marks > 75;

-- 4. Get all students enrolled in the 'Java' course.
SELECT* FROM Students WHERE course= 'java';

-- 5. Use LIKE to get all students whose names start with 'R'.
SELECT * FROM Students WHERE name LIKE 'R%';

-- 6. Use IN to fetch students who are enrolled in 'Java', 'Python'.
-- SELECT * FROM Students WHERE course= 'java' or 'python';
SELECT * FROM Students WHERE LOWER(course) IN ('java', 'python');

-- 7. Use BETWEEN to fetch students with marks between 60 and 90.
SELECT * FROM Students WHERE marks BETWEEN 60 AND 90;

-- 8. Count total number of students.
SELECT COUNT(*) AS total_students FROM Students;

-- 9. Get the maximum marks from the table.
SELECT MAX(marks) AS max_marks FROM Students;

-- 10. Create an Orders table with order_id, customer_name, amount, date.
CREATE TABLE Orders (
  order_id INT,
  customer_name VARCHAR(100),
  amount DECIMAL(10,2),
  order_date DATETIME
);

-- 11. Insert 5 sample orders.
INSERT INTO Orders (order_id, customer_name, amount, order_date)
VALUES
(1, 'Rachit', 1200.50, NOW()),
(2, 'Rohit', 800.00, NOW()),
(3, 'Rohan', 1500.75, NOW()),
(4, 'Rahul', 400.00, NOW()),
(5, 'Ravindra', 2200.00, NOW());

-- 12. Fetch all orders greater than ₹1000.
SELECT * FROM Orders WHERE amount > 1000;

-- 13. List orders in descending order by amount.
SELECT * FROM Orders ORDER BY amount DESC;

-- 14. Group orders by customer_name.
SELECT customer_name, SUM(amount) AS total_amount
FROM Orders
GROUP BY customer_name;

-- 15. Count number of orders per customer.
SELECT customer_name, COUNT(*) AS order_count
FROM Orders
GROUP BY customer_name;

-- 16. Create a Users table for login with username, password.
CREATE TABLE Users (
  username VARCHAR(100),
  password VARCHAR(100)
);

-- Insert some dummy users (optional):
INSERT INTO Users VALUES ('admin', 'admin123'), ('rachit', 'pass123');

-- 17. Write a query to fetch user with matching username and password.
SELECT * FROM Users WHERE username = 'rachit' AND password = 'pass123';

-- 18. Create a LoginLogs table with login timestamp.
CREATE TABLE LoginLogs (
  username VARCHAR(100),
  login_time DATETIME
);

-- 19. Insert current timestamp in LoginLogs for a user.
INSERT INTO LoginLogs VALUES ('rachit', NOW());

-- 20. Fetch all logs from the last 1 hour using NOW() and INTERVAL.
SELECT * FROM LoginLogs
WHERE login_time >= NOW() - INTERVAL 1 HOUR;