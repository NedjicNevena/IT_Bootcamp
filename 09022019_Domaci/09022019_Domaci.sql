-- 1 primer
SELECT o.Naziv, k.SifO
FROM Kurs k, Odsek o
WHERE k.SifO = o.SifO
GROUP BY o.SifO

-- 2 primer
SELECT k.Naziv, r.BrPrijaveljenih
FROM Kurs k, Raspored r
WHERE k.SifK = r.SifK AND BrPrijaveljenih > 3
GROUP BY r.SifK


-- 3 primer
SELECT avg (BrPrijaveljenih)
FROM Kurs k, Raspored r
WHERE k.SifK = r.SifK

-- 4 primer
SELECT k.Naziv
FROM Kurs k, Raspored r, Pohadja p
WHERE k.SifK = r.SifK AND r.sifr = p.SifR
GROUP BY p.SifR = 1

-- 5 primer
SELECT s.Ime
FROM Kurs k, Raspored r, Pohadja p, Student s
WHERE k.SifO = r.SifO AND r.SifR = r.SifR 
AND p.SifS = s.SifS
GROUP BY 