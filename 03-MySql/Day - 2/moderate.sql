-- 21. Create Employees table and group them by department ID.
CREATE TABLE Employees (
  emp_id INT,
  emp_name VARCHAR(100),
  dept_id INT,
  salary DECIMAL(10,2),
  join_date DATE
);

-- Sample insert:
INSERT INTO Employees VALUES
(1, 'Alice', 101, 40000, '2025-07-01'),
(2, 'Bob', 102, 55000, '2025-07-10'),
(3, 'Charlie', 101, 60000, '2025-06-20'),
(4, 'David', 103, 25000, '2025-07-15'),
(5, 'Ethan', 102, 48000, '2025-07-28'),
(6, 'Fiona', 101, 52000, '2025-07-02');

-- 22. Count number of employees per department using GROUP BY.
SELECT dept_id, COUNT(*) AS employee_count
FROM Employees
GROUP BY dept_id;

-- 23. Fetch departments with more than 2 employees using HAVING.
SELECT dept_id, COUNT(*) AS employee_count
FROM Employees
GROUP BY dept_id
HAVING COUNT(*) > 2;

-- 24. Calculate average salary per department.
SELECT dept_id, AVG(salary) AS avg_salary
FROM Employees
GROUP BY dept_id;

-- 25. List employees whose names contain exactly 5 characters.
SELECT * FROM Employees
WHERE LENGTH(emp_name) = 5;

-- 26. Use NOT BETWEEN to filter salaries outside the 30k–60k range.
SELECT * FROM Employees
WHERE salary NOT BETWEEN 30000 AND 60000;

-- 27. Select employees who joined within the last 30 days using CURDATE() and INTERVAL.
SELECT * FROM Employees
WHERE join_date >= CURDATE() - INTERVAL 30 DAY;

-- 28. Join Orders and Customers tables to fetch order details with customer info.
-- Assuming Customers table:
CREATE TABLE Customers (
  customer_id INT,
  customer_name VARCHAR(100)
);

-- And Orders with customer_id:
ALTER TABLE Orders ADD customer_id INT;

-- INNER JOIN query:
SELECT o.order_id, o.amount, o.order_date, c.customer_name
FROM Orders o
JOIN Customers c ON o.customer_id = c.customer_id;

-- 29. Create Products and Categories tables and perform an INNER JOIN.
CREATE TABLE Categories (
  category_id INT,
  category_name VARCHAR(100)
);

CREATE TABLE Products (
  product_id INT,
  product_name VARCHAR(100),
  category_id INT
);

-- INNER JOIN
SELECT p.product_name, c.category_name
FROM Products p
JOIN Categories c ON p.category_id = c.category_id;

-- 30. LEFT JOIN to list all categories even if they have no products.
SELECT c.category_name, p.product_name
FROM Categories c
LEFT JOIN Products p ON c.category_id = p.category_id;

-- 31. RIGHT JOIN to get all products even if category is missing.
SELECT c.category_name, p.product_name
FROM Categories c
RIGHT JOIN Products p ON c.category_id = p.category_id;

// 32. Create a Books collection in MongoDB
use bookstore;
db.createCollection("Books");

// 33. Insert 3 books
db.Books.insertMany([
  { title: "Java Mastery", author: "Rachit Sharma", price: 699 },
  { title: "MongoDB Guide", author: "Jane Doe", price: 499 },
  { title: "Web Dev", author: "John Smith", price: 599 }
]);

// 34. Fetch all books where price > 500
db.Books.find({ price: { $gt: 500 } });

// 35. Use $in to match books from specific authors
db.Books.find({ author: { $in: ["Rachit Sharma", "Jane Doe"] } });

// 36. Use $and, $or queries
db.Books.find({
  $or: [
    { price: { $lt: 600 } },
    { author: "Rachit Sharma" }
  ]
});

// 37. Use $aggregate to calculate total and average book price
db.Books.aggregate([
  {
    $group: {
      _id: null,
      totalPrice: { $sum: "$price" },
      avgPrice: { $avg: "$price" }
    }
  }
]);

// 38. Difference: MongoDB document vs MySQL row
/*
MySQL Row:
- Structured, relational, fixed schema.
- Example: table row with columns: id, name, salary.

MongoDB Document:
- Flexible, semi-structured (JSON-like).
- Example: { "_id": ObjectId(...), name: "Rachit", skills: ["Java", "MongoDB"] }
*/

// 39. Scenario: Why would a startup prefer MongoDB?
/*
A startup building a dynamic app (like a social media platform) may prefer MongoDB because:
- It allows rapid schema changes (agility).
- JSON-like format maps easily to frontend.
- Easier scaling and faster development cycles.
*/

// 40. MongoDB: Group orders by customer and count total orders
db.Orders.aggregate([
  {
    $group: {
      _id: "$customer_name",
      total_orders: { $sum: 1 }
    }
  }
]);
