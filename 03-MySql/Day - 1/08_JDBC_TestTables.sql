USE practicedb;

-- 45. Create a Users table with username and password (for login simulation).
CREATE TABLE Users (
    id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(50) UNIQUE NOT NULL,
    password VARCHAR(100) NOT NULL
);

-- 46. Insert dummy users for testing login from Java.
INSERT INTO Users (username, password)
VALUES
('rachit123', 'pass123'),
('anjali99', 'secure@456'),
('amitdev', 'dev789'),
('sonals', 'sonal@2025'),
('rahul_k', 'rahulPwd');

-- 47. Write a SELECT query to fetch user by username and password (for JDBC authentication).
SELECT *
FROM Users
WHERE username = 'rachit123' AND password = 'pass123';

-- 48. Create a LoginLogs table to track user login time.
CREATE TABLE LoginLogs (
    log_id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(50),
    login_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- 49. Insert a log into LoginLogs using current timestamp.
INSERT INTO LoginLogs (username)
VALUES ('rachit123');

-- 50. Fetch all logs where login time is within the last 1 hour.
SELECT *
FROM LoginLogs
WHERE login_time >= NOW() - INTERVAL 1 HOUR;

