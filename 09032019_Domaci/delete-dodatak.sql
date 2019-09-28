SELECT *
FROM Automobil a
WHERE a.IdA not in (select idA from Kupovina)