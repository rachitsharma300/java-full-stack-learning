USE practicedb;

-- 33. Count number of employees in each department.
SELECT department, COUNT(*) AS total_employees
FROM Employees
GROUP BY department;

-- 34. Get average salary per department.
SELECT department, AVG(salary) AS average_salary
FROM Employees
GROUP BY department;

-- 35. List employees ordered by salary in descending order.
SELECT *
FROM Employees
ORDER BY salary DESC;

-- 36. Fetch names of employees whose names have exactly 5 characters.
SELECT name
FROM Employees
WHERE LENGTH(name) = 5;

-- 37. Find employees with duplicate department IDs.
SELECT *
FROM Employees
WHERE department IN (
    SELECT department
    FROM Employees
    GROUP BY department
    HAVING COUNT(*) > 1
);

-- 38. Group employees by join year.
SELECT YEAR(join_date) AS join_year, COUNT(*) AS total_employees
FROM Employees
GROUP BY YEAR(join_date);

-- 39. Select employees who joined in the last 30 days.
SELECT *
FROM Employees
WHERE join_date >= CURDATE() - INTERVAL 30 DAY;



