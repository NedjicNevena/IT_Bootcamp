PRAGMA forein_keys = off;
BEGIN TRANSACTION;
ALTER TABLE Automobil RENAME TO Automobil2;

CREATE TABLE Automobil(
IdA INTEGER PRIMARY KEY,
 RegBr INTEGER,
 IdM INTEGER,
 CONSTRAINT fk_Model
 FOREIGN KEY (IdM)
 REFERENCES Model(IdM)
 ON DELETE CASCADE
);
INSERT INTO Model SELECT * FROM Model2;
COMMIT;
PRAGMA forein_keys = on;
/*U roditeljskoj tabeli automobil sam u polju kod 
FOREIGN KEY-a dodala ON DELETE CASCADE i onda sam
 bila u mogucnosti da izbrisem trazeni Id */


DELETE FROM Model
WHERE IdM = 2

-- drugi primer cu poslati naknadno