SELECT AVG(Speed) AS AvgSpeed FROM pc

SELECT maker, AVG(screen) as AvgScreen
FROM product AS p
JOIN laptop AS l ON p.model = l.model
GROUP BY maker

SELECT AVG(Speed) AS AvgSpeed 
FROM laptop
WHERE price > 1000

SELECT maker, AVG(Price) AS AvgPrice
FROM product AS p
JOIN pc ON pc.model = p.model 
GROUP BY maker
HAVING maker = 'A'

SELECT speed, AVG(Price) AS AvgPrice
FROM pc
GROUP BY speed

SELECT maker, COUNT(*) as CNT
FROM product
WHERE type = 'PC' 
GROUP BY maker
HAVING COUNT(*) >= 3

SELECT TOP(1) 
	maker, 
	MAX(Price) as maxPrice
FROM product AS p
JOIN pc ON pc.model = p.model 
GROUP BY maker
ORDER BY maxPrice DESC

SELECT speed, AVG(price) AS AvgPrice
FROM pc
GROUP BY speed
HAVING speed > 800