-- 1. primer
SELECT DISTINCT(o.Naziv), count(k.SifO) as "Broj kurseva"
FROM Kurs k, Odsek o
WHERE k.SifO = o.SifO
GROUP BY k.SifO

-- 2. primer
SELECT k.Naziv, count(p.SifR) as "Broj studenata"
FROM Kurs k, Raspored r, Pohadja p
WHERE k.SifK = r.SifK AND r.SifR = p.SifR
GROUP BY r.SifK
HAVING count(p.SifR) > 3

-- 3. primer
SELECT round(avg(r.BrPrijaveljenih)) as "Prosecan broj studenata"
FROM Kurs k, Raspored r, Pohadja p
WHERE k.SifK = r.SifK AND r.SifR = p.SifR

-- 4. primer
SELECT k.Naziv
FROM Kurs k, Raspored r, Pohadja p
WHERE k.SifK = r.SifK AND r.SifR = p.SifR 
GROUP BY r.SifR
HAVING p.SifS = 1

-- 5. primer
SELECT s.Ime
FROM Pohadja p, Student s
WHERE p.SifS = s.SifS
GROUP BY p.SifS
HAVING count(p.SifR) > 2

-- 6. primer
SELECT s.Ime
FROM Student s, Ucionica u, Pohadja p, Raspored r
WHERE s.SifS = p.SifS AND p.SifR = r.SifR 
AND r.SifU = '111' AND r.Dan = 'Pon'
AND r.SifU = u.SifU
GROUP BY p.SifS

-- 7. primer
SELECT k.Naziv, r.BrPrijaveljenih as "Max broj prijavljenih"
FROM Kurs k, Raspored r, Profesor p2
WHERE k.SifK = r.SifK AND r.SifP = p2.SifP AND p2.SifP = '7' 
GROUP BY r.SifK

-- 8. primer
SELECT k.Naziv
FROM Kurs k, Preduslov p
WHERE k.SifK = p.SifKP
GROUP BY p.SifKP
HAVING p.SifK = 4

-- 9. primer
SELECT DISTINCT k.Naziv, count(p.SifKP)
FROM Kurs k, Preduslov p
WHERE k.SifK = p.SifK
GROUP BY p.SifK

-- 10. primer
SELECT p.Ime, BrPrijaveljenih as "Broj studenata"
FROM Profesor p, Raspored r, Pohadja po
WHERE p.SifP = r.SifP AND r.SifR = po.SifR 
GROUP BY p.SifP
HAVING count(po.SifS) AND r.Dan = 'Pon'