-- 4 - DCL – Grant & Revoke

-- Grant SELECT and INSERT privileges on the Staff table to user devuser.
GRANT SELECT, INSERT
ON PracticeDB.Staff
TO 'devuser'@'localhost';

-- 19. Revoke DELETE privilege from user intern.

CREATE USER 'intern'@'localhost' IDENTIFIED BY 'somepassword';

GRANT DELETE ON PracticeDB.Staff TO 'intern'@'localhost';
REVOKE DELETE ON PracticeDB.Staff FROM 'intern'@'localhost';
show grants;

REVOKE DELETE
ON PracticeDB.Staff
FROM 'intern'@'localhost';

SHOW GRANTS FOR 'intern'@'localhost';
SHOW GRANTS FOR 'root'@'localhost';

-- 20. Grant ALL privileges to user admin_user on database CompanyDB.

GRANT ALL PRIVILEGES
ON CompanyDB.*
TO 'admin_user'@'localhost';
