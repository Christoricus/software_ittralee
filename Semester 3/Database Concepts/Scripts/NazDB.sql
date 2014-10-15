-- NazDB.sql
-- This script populates the DVDSys database
PROMPT DVDDATA Execution Started ....
PROMPT
PROMPT Clearing Tables
PROMPT
@C:\DVDSys
PROMPT


PROMPT Populating Age_Ratings (4 records)
INSERT INTO Age_Ratings
VALUES('PG', 'Parental Guidance Advised');

INSERT INTO Age_Ratings
VALUES('12', 'Over 12');

INSERT INTO Age_Ratings
VALUES('12A', 'Over 12, Accomp by Adult');

INSERT INTO Age_Ratings
VALUES('18', 'Over 18');




PROMPT Populating Genres (4 records)
INSERT INTO Genres
VALUES('HR', 'Horror');

INSERT INTO Genres
VALUES('RM', 'Romance');

INSERT INTO Genres
VALUES('TH', 'Thriller');

INSERT INTO Genres
VALUES('TS', 'True Story');



PROMPT Populating Rates (4 records)
INSERT INTO Rates
VALUES('NR', 'New Release', 5.00);

INSERT INTO Rates
VALUES('OR', 'Old Release', 3.00);

INSERT INTO Rates
VALUES('CH', 'Childrens', 2.00);

INSERT INTO Rates (RATE_CODE, DESCRIPTION)
VALUES('SP', 'Special Offer');




PROMPT Populating DVDs (6 records)
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



PROMPT Populating Table Members (10 records)
INSERT INTO Members
VALUES(00001, 'Alam', 'Nazmul', 'Main Street', 'Castleisland', 'Kerry', 'danazzy@live.com', 'A', 1);

INSERT INTO Members
VALUES(00002, 'Abdul', 'Naiem', 'Main Street', 'Castleisland', 'Kerry', 'naiem@gmail.com', 'I', 0);

INSERT INTO Members
VALUES(00003, 'Bluett', 'Luke', 'Rock Avenue', 'Abbeyfeale', 'Limerick', 'ljbluet@hotmail.com', 'A', 1);

INSERT INTO Members
VALUES(00004, 'Dowling', 'Sam', 'Main Street', 'Castleisland', 'Kerry', 'samjad11@riseup.net', 'A', 1);

INSERT INTO Members
VALUES(00005, 'Landers', 'John Joe', 'Boherbee', 'Annascaul', 'Kerry', 'jjlanders@msn.com', 'A', 1);

INSERT INTO Members
VALUES(00006, 'Killian', 'Ross', 'Rock Street', 'Tralee', 'Kerry', 'ross@yahoo.ie', 'A', 1);

INSERT INTO Members
VALUES(00007, 'Sadiq', 'Samina', 'Templemore Road', 'Roscrea', 'Tipperary', 'saminas14@outlook.com', 'A', 1);

INSERT INTO Members
VALUES(00008, 'Hassan', 'Khadija', 'Clougher', 'Tralee', 'Kerry', 'khassany@live.com', 'A', 1);

INSERT INTO Members
VALUES(00009, 'Balal', 'Saba', 'Templemore Road', 'Roscrea', 'Tipperary', 'sss@gmail.com', 'A', 1);

INSERT INTO Members
VALUES(00010, 'Begum', 'Nasima', 'Main Street', 'Castleisland', 'Kerry', 'nbegum71@live.com', 'A', 1);


PROMPT Populating Table Rentals (5 records)
INSERT INTO Rentals
VALUES(5, 00001, 00001, 3.00, '02-OCTOBER-1992', TO_DATE('15-10-2014','DD-MM-YYYY'));

INSERT INTO Rentals
VALUES(6, 00002, 00001, 3.00, TO_DATE('02-07-1992','DD-MM-YYYY'), TO_DATE('15-10-2014','DD-MM-YYYY'));

INSERT INTO Rentals
VALUES(7, 00003, 00001, 3.00, TO_DATE('02-07-1992','DD-MM-YYYY'), TO_DATE('15-10-2014','DD-MM-YYYY'));

INSERT INTO Rentals
VALUES(8, 00004, 00001, 3.00, TO_DATE('02-07-1992','DD-MM-YYYY'), TO_DATE('15-10-2014','DD-MM-YYYY'));

INSERT INTO Rentals
VALUES(9, 00005, 00001, 3.00, TO_DATE('02-07-1992','DD-MM-YYYY'), TO_DATE('15-10-2014','DD-MM-YYYY'));
