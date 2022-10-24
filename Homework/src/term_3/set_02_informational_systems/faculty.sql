CREATE DATABASE Faculty

CREATE TABLE Courses (
	Id INT NOT NULL PRIMARY KEY,
	Name NVARCHAR(50) NOT NULL,
	StartDate DATE,
)

CREATE TABLE Students (
	Id INT NOT NULL PRIMARY KEY,
	FacultyNumber INT NOT NULL,
	Name NVARCHAR(50) NOT NULL,
)

CREATE TABLE StudentCourse
(
	StudentId INT,
	CourseId INT,
	Grade INT NOT NULL,
	CONSTRAINT StudentCoursePk PRIMARY KEY (StudentId, CourseId),
	CONSTRAINT FK_Student
      FOREIGN KEY (StudentId) REFERENCES Students (Id),
	CONSTRAINT FK_Course
      FOREIGN KEY (CourseId) REFERENCES Courses (Id)
)