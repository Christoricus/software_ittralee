--ToolSYS
PROMPT Dropping...
PROMPT
DROP TABLE HireItems;
DROP TABLE ToolHire;
DROP TABLE Customers;
DROP TABLE Tools;
DROP TABLE ToolTypes;

PROMPT
PROMPT Creating....
PROMPT


CREATE TABLE ToolTypes
(Category Char (1),
Description char(25) NOT NULL,
Daily_Rate Numeric(5,2) NOT NULL,
CONSTRAINT pk_Types PRIMARY KEY (Category));


CREATE TABLE Tools
(ToolID numeric(3),
Category char(1),
Description char(30),
CONSTRAINT pk_Tools PRIMARY KEY (ToolID));


CREATE TABLE Customers
(CustID Numeric(5),
Fname char(20) NOT NULL,
Sname char (20) NOT NULL,
Phone char(14),
CONSTRAINT pk_Cust PRIMARY KEY (CustID));

CREATE TABLE ToolHire
(HireID Numeric(5),
HireDate Date,
AmountPaid numeric(7,2),
CustID numeric(5),
CONSTRAINT pk_Hire PRIMARY KEY (HireID),
CONSTRAINT fk_Hire_Cust FOREIGN KEY (CustID) References Customers);

CREATE TABLE HireItems
(HireID Numeric(5),
	ToolID numeric(3),
	Days numeric(2),
	HireCost numeric(5,2),
	Status char(1),
  CONSTRAINT pk_HireItems PRIMARY KEY (HireID,ToolID),
  CONSTRAINT fk_HireItems_Tools FOREIGN KEY (ToolID) REFERENCES Tools);

COMMIT;