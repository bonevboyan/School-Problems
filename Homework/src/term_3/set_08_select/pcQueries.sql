SELECT model, speed AS MHz, hd AS GB FROM pc
WHERE price < 1200

SELECT DISTINCT maker from product

SELECT model, ram, screen FROM laptop
WHERE price > 1000

SELECT * FROM printer
WHERE color = 'y'

SELECT model, speed, hd FROM pc
WHERE (cd = '12x' OR cd = '16x') AND price < 2000