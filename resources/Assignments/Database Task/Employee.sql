-- Create Database
CREATE DATABASE EmployeeDB;

-- Use Database
USE EmployeeDB;

-- Create Table
CREATE TABLE Empl (
    empno INT,
    ename VARCHAR(50),
    job VARCHAR(50),
    mgr INT,
    hiredate DATE,
    sal DECIMAL(10,2),
    comm DECIMAL(10,2),
    deptno INT
);

-- Insert Data into table
INSERT INTO Empl VALUES 
(8369, 'SMITH', 'CLERK', 8902, '1990-12-18', 800.00, NULL, 20),
(8499, 'ANYA', 'SALESMAN', 8698, '1991-02-20', 1600.00, 300.00, 30),
(8521, 'SETH', 'SALESMAN', 8698, '1991-02-22', 1250.00, 500.00, 30),
(8566, 'MAHADEVAN', 'MANAGER', 8839, '1991-04-02', 2985.00, NULL, 20),
(8654, 'MOMIN', 'SALESMAN', 8698, '1991-09-28', 1250.00, 1400.00, 30),
(8698, 'BINA', 'MANAGER', 8839, '1991-05-01', 2850.00, NULL, 30),
(8882, 'SHIVANSH', 'MANAGER', 8839, '1991-06-09', 2450.00, NULL, 10),
(8888, 'SCOTT', 'ANALYST', 8566, '1992-12-09', 3000.00, NULL, 20),
(8839, 'AMIR', 'PRESIDENT', NULL, '1991-11-18', 5000.00, NULL, 10),
(8844, 'KULDEEP', 'SALESMAN', 8698, '1991-09-08', 1500.00, 0.00, 30);

-- Sample Query 
SELECT * FROM Empl;

-- Question 
-- A. Write a query to display EName and Sal of employees whose salary are greater than or equal to 2200?
SELECT ename, sal FROM Empl WHERE sal >= 2200;
-- ___ Output____

-- EName	Sal
MAHADEVAN	2985.00
BINA	    2850.00
SHIVANSH	2450.00
SCOTT	    3000.00
AMIR    	5000.00

-- B. Write a query to display details of employees who are not getting commission?
SELECT * FROM Empl WHERE comm IS NULL OR comm = 0;
-- ___ Output____

-- empno	ename	    job	    mgr	    hiredate	sal	        comm	deptno
8369      SMITH	     CLERK	    8902	1990-12-18	800.00	      null   20
8566	  MAHADEVAN	 MANAGER	8839	1991-04-02	2985.00		  null   20
8698	  BINA	     MANAGER	8839	1991-05-01	2850.00		  null   30
8882	  SHIVANSH   MANAGER	8839	1991-06-09	2450.00		  null   10
8888	  SCOTT	     ANALYST	8566	1992-12-09	3000.00		  null   20
8839	  AMIR	     PRESIDENT	null    1991-11-18	5000.00		  null   10
8844	  KULDEEP	 SALESMAN	8698	1991-09-08	1500.00	      0.00   30

-- C. Write a query to display employee name and salary of those employees who don't have their salary in the range of 2500 to 4000?
SELECT ename, sal FROM Empl WHERE sal NOT BETWEEN 2500 AND 4000;
-- ___ Output____
--  ename	  sal
    SMITH	 800.00
    ANYA	 1600.00
    SETH	 1250.00
    MOMIN	 1250.00
    SHIVANSH 2450.00
    AMIR	 5000.00
    KULDEEP  1500.00

-- D. Write a query to display the name, job title and salary of employees who don't have a manager?
SELECT ename, job, sal FROM Empl WHERE mgr IS NULL;
-- ___ Output____
--  ename	  job	     sal
    AMIR	PRESIDENT	5000.00

-- E. Write a query to display the name of an employee whose name contains "A" as third alphabet?
SELECT ename FROM Empl WHERE ename LIKE '__A%';
-- ___ Output____
--  ename

-- Write a query to display the name of an employee whose name contains "T" as the last alphabet?
SELECT ename FROM Empl WHERE ename LIKE '%T';
-- ___ Output____
--  ename
    SCOTT