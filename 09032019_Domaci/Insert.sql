INSERT INTO Model(Model, Marka, BrProdatih, BrNabavljenih, Profit)
VALUES ("BMW", "X6", 10, 20, 1000), ("BMW", "X7", 5, 12, 14000),
("Audi", "A8", 4, 10, 20000), ("Audi", "A4", 6, 15, 15000),
("Lada", "Niva", 20, 50, 10000), ("Yugo", "Coral45", 50, 100, 12000)

INSERT INTO Kupac(Ime, Prezime, BrLK, BrKupljenih)
VALUES ("Zoran", "Milicevic", 12345678, 2), ("Cvijan", "Peranovic", 12345678, 1),
("Ivana", "Stepanovic", 12345678, 1), ("Dusan", "Bobicic", 12345678, 1) 

INSERT INTO Dobavljac (Naziv, BrDobavljenih)
VALUES ("YugoMotors", 30), ("SerbiaCarImport", 20),("BelgradeImport", 10)

INSERT INTO Automobil (RegBr, IdM)
VALUES (23085, 4), (56902, 3), (68423, 1), (45012, 2), (72371, 6), (89123, 5)

INSERT INTO Kupovina (DatumVreme, Cena, IdA, IdK)
VALUES ('23.06.2018.', 40000, 1, 1), ('14.04.2018.', 70000, 2, 1),
('15.06.2017.', 25000, 3, 3), ('12.02.2015.', 300, 5, 2), ('13.03.2016.', 8000, 6, 4)

INSERT INTO Nabavka (DatumVreme, Cena, IdA, IdD)
VALUES ('01.01.2010.', 20000, 2, 3), ('01.01.2010.', 10000, 1, 3),
('01.02.2000.', 1000, 5, 1), ('01.02.2000.', 3000, 6, 1), 
('01.01.2013.', 10000, 3, 2), ('01.01.2013.', 20000, 4, 2)