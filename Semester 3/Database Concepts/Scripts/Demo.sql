-- Demo.sql
-- this script creates the sample database used in Labs

--Drop tables before creating them
PROMPT Dropping Tables
DROP TABLE Students;
DROP TABLE Courses;
DROP TABLE Lecturers;
DROP TABLE Departments;


PROMPT Creating table Departments

CREATE TABLE Departments
(DeptNo numeric(2),
Name varchar2(30),
CONSTRAINT pk_Depts PRIMARY KEY (Deptno));

PROMPT Creating table Lecturers

CREATE TABLE Lecturers
(StaffId Numeric(3),
Surname varchar2(20),
Forename Varchar2(20),
Department Numeric(2),
Salary Numeric(8,2),
DateJoined Date,
CONSTRAINT pk_Lecturers PRIMARY KEY (StaffId),
CONSTRAINT fk_Depts FOREIGN KEY (Department) REFERENCES Departments);

PROMPT Creating table Courses

CREATE TABLE Courses
(CourseCode Varchar2(5),
Title Varchar2(25),
StaffId Numeric(3),
CONSTRAINT pk_Courses PRIMARY KEY (CourseCode),
CONSTRAINT fk_Lecturers FOREIGN KEY (StaffId) REFERENCES Lecturers);

PROMPT Creating table Students
CREATE TABLE Students
(StudId Numeric(4),
Surname varchar2(20),
Forename Varchar2(20),
Street varchar2(20),
Town varchar2(15),
County varchar2(15),
Phone Varchar2(14),
Mobile Varchar2(14),
CourseCode Varchar2(5),
CONSTRAINT pk_Students PRIMARY KEY (StudId),
CONSTRAINT fk_Students FOREIGN KEY (CourseCode) REFERENCES Courses);

PROMPT Populate Tables
PROMPT Populating Departments (5 Rows)

INSERT INTO Departments
VALUES(10,'Business');
INSERT INTO Departments
VALUES(20,'Computing');
INSERT INTO Departments
VALUES(30,'Engineering');
INSERT INTO Departments
VALUES(40,'Health And Leisure');
INSERT INTO Departments
VALUES(50,'Life Sciences');

PROMPT Populating Lecturers (12 Rows)

INSERT INTO Lecturers
VALUES(101,'Smith','Jim',20,50000,'01-FEB-2007');
INSERT INTO Lecturers
VALUES(102,'Kelly','Mary',30,48000,'01-APR-2007');
INSERT INTO Lecturers
VALUES(103,'Jones','Michael',50,42000, '25-MAY-2007');
INSERT INTO Lecturers
VALUES(104,'Burke','Alice',10,45000,'02-MAR-2008');
INSERT INTO Lecturers
VALUES(105,'Smith','Paul',30,51000,'01-SEP-2008');
INSERT INTO Lecturers
VALUES(106,'Kirwin','James',20,47500,'01-SEP-2009');
INSERT INTO Lecturers
VALUES(107,'Kennedy','Anne',10,43750,'30-OCT-2009');
INSERT INTO Lecturers
VALUES(108,'Ahern','Tim',50,41300,'01-NOV-2009');
INSERT INTO Lecturers
VALUES(109,'Browne','Rose',30,44250,'30-MAR-2010');
INSERT INTO Lecturers
VALUES(110,'Fitzpatrick','Anne',10,41000,'01-FEB-2011');
INSERT INTO Lecturers
VALUES(111,'Brosnan','Alan',30,46500,'01-MAY-2011');
INSERT INTO Lecturers
VALUES(112,'Kelly','Frank',20,31000,'01-SEP-2011');

PROMPT Populating Courses (6 Rows)

INSERT INTO Courses
VALUES('BS100', 'Buisness Year 1',104);
INSERT INTO Courses
VALUES('BS200', 'Buisness Year 2',107);
INSERT INTO Courses
VALUES('CP100', 'Computing Year 1',106);
INSERT INTO Courses
VALUES('CP200', 'Computing Year 2',101);
INSERT INTO Courses
VALUES('EN100', 'Engineering Year 1',105);
INSERT INTO Courses (CourseCode, Title)
VALUES('HL100', 'Health And Leisure Year 1');


PROMPT Populating Students (5 Rows)

INSERT INTO Students (StudId, Surname, Forename, Street, Town, County, Phone, CourseCode)
VALUES(2001,'White','James','Main St','Killarney', 'Co.Kerry','064 321554','BS200');
INSERT INTO Students
VALUES(2002,'Foley','Timothy','23 Glendale Rd','Tralee', 'Co.Kerry','066 7125899','087 4561558','CP200');
INSERT INTO Students
VALUES(2003,'Kelly','Anne','9 The Willows','Kenmare', 'Co.Kerry','064 8525699','087 2204125','CP100');
INSERT INTO Students (StudId, Surname, Forename, Street, Town, County, Phone, CourseCode)
VALUES(2004,'Dennis','James','Main St','Ennis', 'Co.Clare','065 7864433','CP200');
INSERT INTO Students (StudId, Surname, Forename, Street, Town, County, Phone, CourseCode)
VALUES(2005,'Casey','Mary','12 Ivy Terrace','Tralee', 'Co.Kerry','066 7145896','BS200');

COMMIT;

