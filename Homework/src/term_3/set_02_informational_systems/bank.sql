CREATE DATABASE TestBank

CREATE TABLE Clients (
	Id INT NOT NULL PRIMARY KEY,
	Name NVARCHAR(50) NOT NULL,
	Phone VARCHAR(10),
	EGN VARCHAR(10)
)

CREATE TABLE Accounts (
	Id INT NOT NULL PRIMARY KEY,
	Number INT NOT NULL,
	Balance DECIMAL(18, 2),
	Type VARCHAR(20),
	ClientId INT NOT NULL FOREIGN KEY REFERENCES Clients(Id)
)