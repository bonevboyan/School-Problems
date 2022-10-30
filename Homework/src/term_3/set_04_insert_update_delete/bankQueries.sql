INSERT INTO Clients VALUES
(1, 'Hristo', '0123456789', '0444444444'),
(2, 'Dimitar', '0987656789', '0456789876')

INSERT INTO Accounts VALUES
(1, 123, 47358.67, 'Savings', 1),
(2, 456, 100.32, 'Credit', 1),
(3, 789, 9.10, 'Debit', 2)

UPDATE Accounts
SET Balance = 0
FROM Clients c
JOIN Accounts a
	ON c.Id = a.ClientId
WHERE Name = 'Hristo'

DELETE Accounts
WHERE Balance > 5