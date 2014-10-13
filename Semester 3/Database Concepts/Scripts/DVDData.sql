-- Competition.sql
-- This script populates the DVDSys database

PROMPT Populating Age_Ratings

INSERT INTO Age_Ratings
VALUES('PG', 'Parental Guidance Advised');

INSERT INTO Age_Ratings
VALUES('12', 'Over 12');

INSERT INTO Age_Ratings
VALUES('12A', 'Over 12, Accompanied by Adult');

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



