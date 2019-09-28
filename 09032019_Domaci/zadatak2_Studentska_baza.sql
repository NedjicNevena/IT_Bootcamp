-- 1. primer
SELECT *
FROM predmet

-- 2. primer
SELECT *
FROM dosije
WHERE mesto_rodjenja = 'Beograd'

-- 3.primer
SELECT mesto_rodjenja
FROM dosije
WHERE mesto_rodjenja is not null

-- 4. primer
SELECT naziv
FROM predmet
WHERE bodovi > 6

-- 5. primer
SELECT sifra, naziv
FROM predmet
WHERE bodovi BETWEEN 8 AND 15

-- 6. primer
SELECT  *
FROM ispit
WHERE bodovi = 81 or bodovi = 76 or bodovi = 59

-- 7. primer
SELECT *
FROM ispit
WHERE bodovi != 81 AND bodovi != 76 AND bodovi != 59

-- 8. primer
SELECT naziv, sum(bodovi * 1500) as "Cena ispita"
FROM predmet

-- 9. primer
SELECT naziv, bodovi *1500 as "Cena u dinarima" ,bodovi * 1500 as "Cena ipsita"
FROM predmet

-- 10. primer a)
SELECT *
FROM predmet ORDER BY bodovi ASC

-- 10. primer b)
SELECT *
FROM predmet ORDER BY bodovi DESC

-- 10. primer c)
SELECT *
FROM predmet 
ORDER BY bodovi ASC, naziv DESC;

-- 11. primer
SELECT ime, prezime, datum_rodjenja
FROM dosije
WHERE substr(datum_rodjenja, 7, 4)||'-'||substr(datum_rodjenja, 4,2)||'-'||substr(datum_rodjenja, 1,2)
BETWEEN '1995-02-04' AND '1995-10-10'
ORDER BY prezime

-- 12. primer
SELECT i.oznaka_roka, count(DISTINCT(i.id_predmeta)) as "Broj polozenih ispita", count(DISTINCT(i.indeks)) as "Broj studenata koji su polozili"
FROM ispitni_rok ir, predmet p, ispit i
WHERE ir.oznaka_roka = i.oznaka_roka AND i.id_predmeta = p.id_predmeta
GROUP BY i.oznaka_roka
HAVING i.ocena > 5

-- 13. primer
SELECT d.ime, d.prezime
FROM dosije d, ispit i
WHERE d.indeks = i.indeks AND i.oznaka_roka = 'jan' 
AND i.id_predmeta = '1001' AND i.ocena > 5

-- 14. primer
SELECT avg(i.bodovi) IS NOT NULL as "Prosecan broj poena"
FROM ispit i, predmet p
WHERE i.id_predmeta = p.id_predmeta AND i.id_predmeta = '1021'
AND i.oznaka_roka = 'jan' AND i.oznaka_roka = 'feb'

-- 15. primer
SELECT count(DISTINCT(i.indeks)) as "Broj studenata koji su polozili:"
FROM dosije d, ispit i
WHERE d.indeks = i.indeks AND i.ocena > 5

-- 16. primer
SELECT avg(i.bodovi)
FROM dosije d, ispit i
WHERE d.indeks = i.indeks AND i.indeks = '20130023'

-- 17. primer
SELECT avg(i.ocena)
FROM dosije d, ispit i
WHERE d.indeks = i.indeks AND i.oznaka_roka = 'jan'

-- 18. primer
SELECT DISTINCT p.naziv
FROM predmet p, ispit i
WHERE p.id_predmeta = i.id_predmeta AND p.bodovi = '6'
AND i.oznaka_roka = 'jan'