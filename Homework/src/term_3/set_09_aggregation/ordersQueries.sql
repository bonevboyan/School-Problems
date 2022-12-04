SELECT CustomerName FROM Customers
WHERE Country = 'Germany'

SELECT BirthDate FROM Employees
WHERE FirstName = 'Robert' AND LastName = 'King'

SELECT SupplierName FROM Suppliers
WHERE Address LIKE '%22%'

SELECT ProductID, ProductName FROM Products
WHERE Price > 50

SELECT DISTINCT OrderID FROM [OrderDetails]
WHERE ProductID = 72 OR ProductID = 74