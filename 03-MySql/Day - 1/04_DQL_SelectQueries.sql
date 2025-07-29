USE practicedb;

-- 21. Select all columns from the Staff table.
SELECT * FROM Staff;

-- 22. Select only name and email of all employees.
SELECT name, email FROM Staff;

-- 23. Use alias to display name as Employee Name.
SELECT name AS 'Employee Name' FROM Staff;

-- 24. Get the distinct departments from the Staff table.
SELECT DISTINCT department FROM Staff;

-- 25. Select top 3 highest-paid employees.
SELECT * FROM Staff ORDER BY salary DESC LIMIT 3;

-- Data Types
-- 26. Create a Products table with appropriate data types: id, name, price, stock, added_date.
CREATE TABLE Products (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    price FLOAT,
    stock INT,
    added_date DATE
);

-- 27. Insert at least 3 products using correct data types.
INSERT INTO Products (name, price, stock, added_date) VALUES
('Laptop', 55999.99, 10, '2025-07-28'),
('Smartphone', 24999.50, 25, '2025-07-27'),
('Headphones', 1499.99, 50, '2025-07-26');


-- 28. Change data type of price to DECIMAL(10,2).
ALTER TABLE Products
MODIFY COLUMN price DECIMAL(10,2);



