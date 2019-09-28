UPDATE Kupovina
SET Cena = 25000
WHERE IdKup = 1

UPDATE Nabavka
SET Cena = Cena +(Cena * 10 / 100)
WHERE IdN = 1 OR IdN = 2