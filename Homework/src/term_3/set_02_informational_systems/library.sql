CREATE DATABASE SchoolLibrary

USE SchoolLibrary

CREATE TABLE Classes (
	Id INT NOT NULL PRIMARY KEY,
	Number INT NOT NULL,
	Letter CHAR(1) NOT NULL,
	TeacherName NVARCHAR(50) NOT NULL
)

CREATE TABLE Students (
	Id INT NOT NULL PRIMARY KEY,
	Name NVARCHAR(50) NOT NULL,
	ClassNumber INT NOT NULL,
	ClassId INT NOT NULL FOREIGN KEY REFERENCES Classes(Id)
)

CREATE TABLE Books (
	Id INT NOT NULL PRIMARY KEY,
	Name NVARCHAR(50) NOT NULL,
	Author NVARCHAR(50) NOT NULL
)

CREATE TABLE StudentBooks
(
	StudentId INT,
	BookId INT,
	CONSTRAINT StudentBooksPk PRIMARY KEY (StudentId, BookId),
	CONSTRAINT FK_Student
      FOREIGN KEY (StudentId) REFERENCES Students (Id),
	CONSTRAINT FK_Book
      FOREIGN KEY (BookId) REFERENCES Books (Id)
)