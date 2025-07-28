-- 1. Create a database named CompanyDB
CREATE DATABASE CompanyDB;

USE CompanyDB;

-- 2. Create a table Employees with id, name, salary, join_date, and dept_id.
CREATE table Employees (
id INT,
name VARCHAR(50),
salary DOUBLE,
join_date DATE,
dept_id INT
);

SHOW TABLES;

-- 3. Alter the table to add an email column.
ALTER TABLE Employees
ADD COLUMN email VARCHAR(100);

-- 4. Rename the table Employees to Staff.
RENAME TABLE Employees to Staff;

-- 5. Drop the table TempData.
DROP TABLE Staff;

-- MySQL Operators + WHERE Clause
CREATE DATABASE IF NOT EXISTS PracticeDB;
USE PracticeDB;

CREATE TABLE employees (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50),
    salary DECIMAL(10, 2),
    join_date DATE,
    department VARCHAR(50)
);

INSERT INTO employees (name, salary, join_date, department) VALUES
('Aman Singh', 60000, '2023-02-15', 'HR'),
('Neha Sharma', 48000, '2022-11-01', 'Sales'),
('Ankur Mehta', 75000, '2024-01-20', 'Tech'),
('Ravi Kumar', NULL, '2021-09-10', 'Finance'),
('Akash Verma', 55000, '2023-06-05', 'Tech'),
('Priya Rai', 95000, '2022-05-10', 'HR'),
('Anjali Chauhan', 45000, '2024-03-12', 'Sales'),
('Deepak Sharma', 120000, '2023-12-01', 'Tech'),
('Rachit Sharma', 167000, '2023-07-25', "Manager"),
('Ramesh Rawat', 99000, '2022-02-20', 'HR');

-- 6. Select all employees with salary greater than 50000.
SELECT * FROM employees WHERE salary > 50000;

-- 7. Retrieve employees with names starting with 'A'.
SELECT * FROM employees WHERE name LIKE 'A%';

-- 8. Get all employees who joined between '2023-01-01' and '2024-01-01'.
SELECT * FROM employees
WHERE join_date BETWEEN '2023-01-01' AND '2024-01-01';

-- 9. Fetch records where salary is NOT NULL and less than 1 lakh.
SELECT * FROM employees
WHERE salary IS NOT NULL AND salary < 100000;

-- 10. Select employees where department is either ‘HR’, ‘Sales’, or ‘Tech’.

SELECT * FROM employees
WHERE department IN ('HR', 'Sales', 'Tech');





