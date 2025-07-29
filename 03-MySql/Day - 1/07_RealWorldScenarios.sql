USE practicedb;

-- 40. Create a table Orders with fields id, customer_name, order_date, total_amount.
CREATE TABLE Orders (
    id INT PRIMARY KEY AUTO_INCREMENT,
    customer_name VARCHAR(100),
    order_date DATE,
    total_amount DECIMAL(10,2)
);

-- 41. Write a query to fetch orders placed in the current month.
SELECT *
FROM Orders
WHERE MONTH(order_date) = MONTH(CURDATE())
  AND YEAR(order_date) = YEAR(CURDATE());

  -- 42. Insert 5 sample orders and fetch total revenue generated.
  INSERT INTO Orders (customer_name, order_date, total_amount)
VALUES
('Rachit Sharma', '2025-07-05', 1200.50),
('Anjali Verma', '2025-07-10', 2300.00),
('Amit Yadav', '2025-07-15', 450.75),
('Sonal Singh', '2025-06-28', 780.00),
('Rahul Kumar', '2025-07-20', 1499.99);

-- Total revenue:
SELECT SUM(total_amount) AS total_revenue
FROM Orders;

-- 43. Find the customer who placed the highest value order.
SELECT customer_name, total_amount
FROM Orders
ORDER BY total_amount DESC
LIMIT 1;

-- 44. Count how many orders each customer has placed.
SELECT customer_name, COUNT(*) AS total_orders
FROM Orders
GROUP BY customer_name;



