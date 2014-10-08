-- Nazmul Alam
-- 08/10/2014
-- DVDSys.sql
-- This script creates DVDSys Rental SYSTEM

PROMPT Script Execution Started....

PROMPT

PROMPT Dropping Tables...
DROP TABLE Rentals;
DROP TABLE DVDs;
DROP TABLE Rates;
DROP TABLE Members;
DROP TABLE Genres;
DROP TABLE Age_Ratings;






PROMPT

PROMPT Creating Table Age_Ratings
CREATE TABLE Age_Ratings (
	Age_Code char(3), 
	Description char(25),
	CONSTRAINT pk_AgeRatings PRIMARY KEY (Age_Code)
);

PROMPT Creating Table Genres
CREATE TABLE Genres (
	Genre_Code char(2),
	Description char(15),
	CONSTRAINT pk_Genres PRIMARY KEY (Genre_Code)
);

PROMPT Creating Table Rates
CREATE TABLE Rates (
	Rate_Code char(2),
	Description char(15) NOT NULL,
	Rate numeric(3,2) CHECK (Rate>0),
	CONSTRAINT pk_Rates PRIMARY KEY (Rate_Code)
);

PROMPT Creating Table DVDs
CREATE TABLE DVDs (
	DVD_Id numeric(5),
	Title char(35),
	Age_Code char(3),
	Genre_Code char(2),
	Rate_Code char(2),
	Status char(1),
	CONSTRAINT pk_DVDs PRIMARY KEY (DVD_Id),
	CONSTRAINT fk_DVDs_AgeRatings FOREIGN KEY (Age_Code) REFERENCES Age_Ratings,
	CONSTRAINT fk_DVDs_Genres FOREIGN KEY (Genre_Code) REFERENCES Genres,
	CONSTRAINT fk_DVDs_Rates FOREIGN KEY (Rate_Code) REFERENCES Rates
);

PROMPT Creating Table Members
CREATE TABLE Members (
	Member_Id numeric(5),
	Surname char(20),
	Forename char(20),
	Street char(25),
	Town char(20),
	County char(20),
	Status char(1),
	CONSTRAINT pk_Members PRIMARY KEY (Member_Id)
);


PROMPT Creating Table Rentals
CREATE TABLE Rentals (
	Rental_ID numeric(5),
	Member_Id numeric(5),
	DVD_Id numeric(4),
	Rate numeric(3,2),
	Rental_Date DATE,
	Due_Date DATE,
	CONSTRAINT pk_Rentals PRIMARY KEY (Rental_ID),
	CONSTRAINT fk_Rentals_Members FOREIGN KEY (Member_Id) REFERENCES Members,
	CONSTRAINT fk_Rentals_DVDs FOREIGN KEY (DVD_Id) REFERENCES DVDs
);



PROMPT Script Execution Ended.