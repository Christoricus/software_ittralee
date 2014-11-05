 C Woods
-- Jan 2014
-- Script to create a database with one table Stock

-- Drop table Stock before creating it
DROP TABLE Stock;


Prompt Creating Stock Table
CREATE TABLE Stock
(StockNo numeric(5),
 Description varchar2(30) NOT NULL,
 CostPrice numeric(6,2),
 SalePrice numeric(6,2),
 Qty numeric(4) NOT NULL,
 ReorderLevel numeric(3),
 CONSTRAINT pk_Stock PRIMARY KEY (StockNo));

Prompt Populating Table Stock
INSERT INTO Stock
VALUES(1,'Levi',45,75,200,20);

INSERT INTO Stock
VALUES(2,'Wrangler',35,70,150,25);

INSERT INTO Stock
VALUES(3,'Pepe',32,65,160,10);

INSERT INTO Stock
VALUES(4,'Lvi 901',39,89,100,15);

INSERT INTO Stock
VALUES(5,'White Levi 501',52,115,18,20);

COMMIT;





