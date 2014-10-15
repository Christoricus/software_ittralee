-- DVDData.sql
-- This script populates the DVDSys database

PROMPT Populating Age_Ratings

INSERT INTO Age_Ratings
VALUES('PG', 'Parental Guidance Advised');

INSERT INTO Age_Ratings
VALUES('12', 'Over 12');

INSERT INTO Age_Ratings
VALUES('12A', 'Over 12, Accomp by Adult');

INSERT INTO Age_Ratings
VALUES('18', 'Over 18');

PROMPT Populating Genres

INSERT INTO Genres
VALUES('HR', 'Horror');

INSERT INTO Genres
VALUES('RM', 'Romance');

INSERT INTO Genres
VALUES('TH', 'Thriller');

INSERT INTO Genres
VALUES('TS', 'True Story');


PROMPT Populating Rates

INSERT INTO Rates
VALUES('NR', 'New Release', 5.00);

INSERT INTO Rates
VALUES('OR', 'Old Release', 3.00);

INSERT INTO Rates
VALUES('CH', 'Childrens', 2.00);


PROMPT Populating DVDs

INSERT INTO DVDs
VALUES(00001, 'Disturbia', '12A', 'TH', 'OR', 'A');

INSERT INTO DVDs
VALUES(00002, 'Spider Man 3', '12', 'HR', 'NR', 'A');

INSERT INTO DVDs
VALUES(00003, 'Tangled', 'PG', 'TH', 'OR', 'A');

INSERT INTO DVDs
VALUES(00004, 'The Vow', '12A', 'RM', 'OR', 'A');

INSERT INTO DVDs
VALUES(00005, 'Seven Pound', '18', 'TS', 'OR', 'A');


PROMPT Populating Members

INSERT INTO Members
VALUES(00001, 'Alam', 'Nazmul', 'Main Street', 'Castleisland', 'Kerry', 'danazzy@live.com', 001, 'A');

INSERT INTO Members
VALUES(00002, 'Abdul', 'Naiem', 'Main Street', 'Castleisland', 'Kerry', 'naiem@gmail.com', 000, 'I');

INSERT INTO Members
VALUES(00003, 'Bluett', 'Luke', 'Rock Avenue', 'Abbeyfeale', 'Limerick', 'ljbluet@hotmail.com', 001, 'A');

INSERT INTO Members
VALUES(00004, 'Dowling', 'Sam', 'Main Street', 'Castleisland', 'Kerry', 'samjad11@riseup.net', 001, 'A');

INSERT INTO Members
VALUES(00005, 'Landers', 'John Joe', 'Boherbee', 'Annascaul', 'Kerry', 'jjlanders@msn.com', 001, 'A');

INSERT INTO Members
VALUES(00006, 'Killian', 'Ross', 'Rock Street', 'Tralee', 'Kerry', 'ross@yahoo.ie', 001, 'A');

INSERT INTO Members
VALUES(00007, 'Sadiq', 'Samina', 'Templemore Road', 'Roscrea', 'Tipperary', 'saminas14@outlook.com', 001, 'A');

INSERT INTO Members
VALUES(00008, 'Hassan', 'Khadija', 'Clougher', 'Tralee', 'Kerry', 'khassany@live.com', 001, 'A');

INSERT INTO Members
VALUES(00009, 'Balal', 'Saba', 'Templemore Road', 'Roscrea', 'Tipperary', 'sss@gmail.com', 001, 'A');

INSERT INTO Members
VALUES(00010, 'Begum', 'Nasima', 'Main Street', 'Castleisland', 'Kerry', 'nbegum71@live.com', 001, 'A');

