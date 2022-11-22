CREATE DATABASE Hospital

USE Hospital

CREATE TABLE MedicalSpecialties (
	SpecialtyId INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
	SpecialtyName VARCHAR(20) NOT NULL
)

CREATE TABLE Doctors (
	DoctorId INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
	FirstName NVARCHAR(30) NOT NULL,
	LastName NVARCHAR(30) NOT NULL,
	EGN CHAR(10) NOT NULL,
	SpecialtyId INT FOREIGN KEY REFERENCES MedicalSpecialties(SpecialtyId),
	OfficeNumber INT NOT NULL CHECK (OfficeNumber >= 100 AND OfficeNumber <= 530)
)

CREATE TABLE Patients (
	PatientId INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
	FirstName NVARCHAR(30) NOT NULL,
	LastName NVARCHAR(30) NOT NULL,
	EGN CHAR(10) NOT NULL,
	Address NVARCHAR(100),
	Telephone CHAR(10),
	Sex CHAR(1) NOT NULL
)

CREATE TABLE Treatments (
	TreatmentId INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
	Diagnose NVARCHAR(30) NOT NULL,
	StartDate DATE NOT NULL,
	PatientId INT NOT NULL FOREIGN KEY REFERENCES Patients(PatientId),
	DoctorId INT NOT NULL FOREIGN KEY REFERENCES Doctors(DoctorId)
)

ALTER TABLE Treatments
ADD EndDate DATE NOT NULL

ALTER TABLE Patients
ADD CHECK (Sex = 'M' OR Sex = 'F' OR Sex = '-')