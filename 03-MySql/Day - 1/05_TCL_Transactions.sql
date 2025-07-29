USE practicedb;

START TRANSACTION;

INSERT INTO Staff (name, email, salary, department)
VALUES ('Rohan Kumar', 'rohan@example.com', 45000, 'IT');

-- Check before rollback
SELECT * FROM Staff WHERE name = 'Rohan Kumar';

ROLLBACK;
-- Verify rollback
SELECT * FROM Staff WHERE name = 'Rohan Kumar';

-- 30. Start a transaction, delete an employee, and commit it.
START TRANSACTION;

DELETE FROM Staff
WHERE name = 'anil Sharma';

COMMIT;

-- Verify deletion
SELECT * FROM Staff WHERE name = 'Amit Sharma';

-- Disable SAFE MODE 0 and 1 for enable
SET SQL_SAFE_UPDATES = 0;

-- 31. Create a savepoint after inserting one row, insert another, and then rollback to the savepoint.
START TRANSACTION;

INSERT INTO Staff (name, email, salary, department)
VALUES ('Neha Verma', 'neha@example.com', 48000, 'HR');

SAVEPOINT after_first_insert;

INSERT INTO Staff (name, email, salary, department)
VALUES ('Suresh Singh', 'suresh@example.com', 52000, 'Sales');

-- Rollback only the second insert
ROLLBACK TO after_first_insert;

-- Commit the first insert
COMMIT;

-- Check the final state
SELECT * FROM Staff WHERE name IN ('Neha Verma', 'Suresh Singh');

-- 32. Set the isolation level to READ COMMITTED before a transaction.
SET SESSION TRANSACTION ISOLATION LEVEL READ COMMITTED;

START TRANSACTION;

SELECT * FROM Staff;

COMMIT;


