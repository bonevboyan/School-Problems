INSERT INTO MedicalSpecialties VALUES
('Surgeon'),
('Neurologist'),
('Psychiatrist'),
('Cardiologist')

INSERT INTO Doctors VALUES 
('Ivan', 'Ivanov', '1231231231', 1, 200)

INSERT INTO Patients (FirstName, LastName, EGN, Sex) VALUES
('Gosho', 'Goshov', '9879879871', 'M')

INSERT INTO Treatments (Diagnose, StartDate, EndDate, PatientId, DoctorId) VALUES
('Qzva', '2022-01-01', '2023-02-02', 1, 1)