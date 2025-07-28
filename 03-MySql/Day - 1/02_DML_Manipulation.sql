CREATE DATABASE IF NOT EXISTS PracticeDB;
USE PracticeDB;

CREATE TABLE Staff (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50),
    salary DECIMAL(10, 2),
    join_date DATE,
    department VARCHAR(50),
    email VARCHAR(100)
);

DROP table Staff;

INSERT INTO Staff (name, salary, join_date, department, email) VALUES
('Aman Singh', 60000, '2023-02-15', 'HR', NULL),
('Neha Sharma', 48000, '2022-11-01', 'Sales', NULL),
('Ankur Mehta', 75000, '2024-01-20', 'Tech', NULL),
('Ravi Kumar', NULL, '2021-09-10', 'Finance', NULL),
('Akash Verma', 55000, '2023-06-05', NULL, NULL),
('Priya Rai', 95000, '2022-05-10', 'HR', NULL),
('Anjali Chauhan', 45000, '2024-03-12', 'Sales', NULL),
('Deepak Sharma', 120000, '2023-12-01', 'Tech', NULL),
('Rachit Sharma', 167000, '2023-07-25', 'Manager', NULL),
('Ramesh Rawat', 99000, '2022-02-20', NULL, NULL);

-- 11. Insert 5 dummy records into the Staff table.
INSERT INTO Staff (name, salary, join_date, department, email) VALUES
('Vinay Gupta', 50000, '2023-08-10', 'Tech', NULL),
('Meera Jain', 47000, '2022-09-12', 'HR', 'meera.jain@example.com'),
('Sanjay Singh', 30000, '2023-04-01', 'Sales', NULL),
('Nisha Yadav', 62000, '2024-01-02', 'Marketing', 'nisha.y@example.com'),
('Gaurav Patel', 80000, '2023-06-18', NULL, NULL);

-- 12. Update the salary of employee with ID = 3 to 75000.
UPDATE Staff
SET salary = 75000 WHERE id = 3;

-- 13. Delete all records where department is null.
DELETE FROM Staff
WHERE DEPARTMENT IS NULL;

-- Temporarily Disable Safe Update Mode
SET SQL_SAFE_UPDATES = 0;

-- 14. Increase salary of all employees by 10%.
UPDATE Staff
SET salary = salary * 1.10;

-- 15. Insert multiple rows in a single SQL statement.
INSERT INTO Staff (name, salary, join_date, department, email) VALUES
('Sneha Rana', 53000, '2023-03-10', 'Finance', 'sneha.rana@example.com'),
('Manoj Thakur', 40000, '2024-02-14', 'Tech', NULL),
('Alok Das', 39000, '2022-11-20', 'Support', NULL);

-- 16. Delete employees who joined before '2020-01-01'.
DELETE FROM Staff
WHERE join_date < '2020-01-01';

-- 17. Update email column of employees where email is NULL.
UPDATE Staff
SET email = CONCAT(LOWER(REPLACE(name, ' ', '.')), '@company.com')
WHERE email IS NULL;










