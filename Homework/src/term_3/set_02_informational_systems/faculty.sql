CREATE DATABASE Faculty

CREATE TABLE Courses (
	Id INT NOT NULL PRIMARY KEY,
	Name NVARCHAR(50) NOT NULL,
)

CREATE TABLE Students (
	Id INT NOT NULL PRIMARY KEY,
	FacultyNumber INT NOT NULL,
	Name NVARCHAR(50) NOT NULL,
	Grade INT NOT NULL,
)

CREATE TABLE StudentCourse
(
  StudentId INT,
  CourseId INT,
  StartDate DATE,
  CONSTRAINT StudentCoursePk PRIMARY KEY (StudentId, CourseId),
  CONSTRAINT FK_movie 
      FOREIGN KEY (StudentId) REFERENCES Students (Id),
  CONSTRAINT FK_category 
      FOREIGN KEY (CourseId) REFERENCES Courses (Id)
);