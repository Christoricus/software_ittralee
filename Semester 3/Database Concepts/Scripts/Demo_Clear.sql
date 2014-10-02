-- Clear_Demo.sql
-- this script removes from teh database, all tables created by the script Demo.sql 

--Drop tables before creating them
PROMPT Dropping Tables
DROP TABLE Students;
DROP TABLE Courses;
DROP TABLE Lecturers;
DROP TABLE Departments;
COMMIT;
