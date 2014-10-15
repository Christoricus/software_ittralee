-- C Woods 08 OCT 2014
-- DVDSYS.sql
-- This script creates the database for the DVD Rental System

PROMPT Script Execution Started....
PROMPT
PROMPT Dropping Tables.....
DROP TABLE Rentals;
DROP TABLE DVDs;
DROP TABLE Age_Ratings;
DROP TABLE Genres;
DROP TABLE Rates;
DROP TABLE Members;


PROMPT
PROMPT Creating Table Age_Ratings
PROMPT
CREATE TABLE Age_Ratings
(Age_Code char(3),
 Description char(25),
 CONSTRAINT pk_AgeRatings PRIMARY KEY (Age_Code));

PROMPT
PROMPT Creating Table Genres
PROMPT
CREATE TABLE Genres
(Genre_Code char(2),
 Description char(20),
 CONSTRAINT pk_Genres PRIMARY KEY (Genre_Code));

PROMPT
PROMPT Creating Table Rates
PROMPT
CREATE TABLE Rates
(Rate_Code char(2),
 Description char(15) NOT NULL,
 Rate numeric(4,2) CHECK (Rate > 0),
 CONSTRAINT pk_Rates PRIMARY KEY (Rate_Code));

PROMPT
PROMPT Creating Table DVDs
PROMPT
CREATE TABLE DVDs
(DVD_Id numeric(4),
 Title char(35),
 Age_Code char(3),
 Genre_Code char(2),
 Rate_Code char(2),
 Status char(1),
 CONSTRAINT pk_DVDs PRIMARY KEY (DVD_Id),
 CONSTRAINT fk_DVDs_AgeRatings FOREIGN KEY (Age_Code) REFERENCES Age_Ratings,
 CONSTRAINT fk_DVDS_Genres FOREIGN KEY (Genre_Code) REFERENCES Genres,
 CONSTRAINT fk_DVDs_Rates FOREIGN KEY (Rate_Code) REFERENCES Rates);

PROMPT
PROMPT Creating Table Members
PROMPT
CREATE TABLE Members
(Member_Id numeric(5),
 Surname char(20),
 Forename char(20),
 Street char(25),
 Town char(20),
 County char(20),
 email char(25) NOT NULL,
 StatUS char(1),
 No_Out numeric(1) DEFAULT 0,
 CONSTRAINT pk_Members PRIMARY KEY (Member_Id));


PROMPT
PROMPT Creating Table Rentals
PROMPT
CREATE TABLE Rentals
(Rental_Id numeric(5),
 Member_Id numeric(5),
 DVD_Id numeric(4),
 Rate numeric(4,2),
 Rental_Date Date,
 Due_Date Date,
 CONSTRAINT pk_Rentals PRIMARY KEY (Rental_Id),
 CONSTRAINT fk_Rental_Mem FOREIGN KEY (Member_Id) REFERENCES Members,
 CONSTRAINT fk_Rental_DVDs FOREIGN KEY (DVD_Id) REFERENCES DVDs);


PROMPT Script Execution Ended.