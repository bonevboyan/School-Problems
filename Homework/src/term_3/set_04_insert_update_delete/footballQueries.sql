INSERT INTO Clubs VALUES
(1,'CSKA', 'Red', 'White', null),
(2,'Levski', 'Blue', 'White', null)

INSERT INTO Players VALUES
(1, 'Stoichkov', '1975-12-12', 1),
(2, 'Berbatov', '1999-12-12', 2),
(3, 'Messi', '1990-01-01', 1)

UPDATE Clubs
SET Capitan = 1
WHERE Id = 1

DELETE FROM Players
WHERE Name = 'Messi'