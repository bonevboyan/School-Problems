CREATE DATABASE Deliveries

CREATE TABLE Suppliers (
	Name NVARCHAR(50) NOT NULL PRIMARY KEY,
	City NVARCHAR(50) NOT NULL,
)

CREATE TABLE Parts (
	Number INT NOT NULL PRIMARY KEY,
	Color NVARCHAR(50) NOT NULL
)

CREATE TABLE SupplierParts
(
	PartNumber INT,
	SupplierName NVARCHAR(50),
	Quantity INT,
	CONSTRAINT SupplierPartsPk PRIMARY KEY (PartNumber, SupplierName),
	CONSTRAINT FK_Part
      FOREIGN KEY (PartNumber) REFERENCES Parts (Number),
	CONSTRAINT FK_Supplier
      FOREIGN KEY (SupplierName) REFERENCES Suppliers (Name)
)