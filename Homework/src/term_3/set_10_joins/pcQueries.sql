SELECT maker, speed 
FROM laptop AS l
JOIN product AS p ON l.model = p.model
WHERE hd >= 9

SELECT product.model, price 
FROM (
	SELECT model, price FROM laptop
	UNION
	SELECT model, price FROM pc
	UNION
	SELECT model, price FROM printer) 
AS products
JOIN product ON products.model = product.model
WHERE product.maker = 'B'

SELECT hd FROM (
	SELECT hd, COUNT(hd) AS count 
	FROM pc
	GROUP BY hd) AS counts
WHERE count >= 2

SELECT DISTINCT 
	CASE 
		WHEN pc1.model > pc2.model 
		THEN pc1.model 
		ELSE pc2.model 
		END as model,
    CASE 
		WHEN pc1.model > pc2.model 
		THEN pc2.model 
		ELSE pc1.model 
		END as model
FROM pc AS pc1
JOIN pc AS pc2 ON pc1.ram = pc2.ram AND pc1.cd = pc2.cd
WHERE pc1.model != pc2.model

SELECT maker, COUNT(code) AS CNT
FROM pc
JOIN product ON product.model = pc.model
GROUP BY maker
HAVING COUNT(code) > 2