import java.util.Arrays;
import java.util.Date;

public class Album {

    private String naziv;
    private String izvodjac;
    private Date datum;
    private MuzickaNumera[] nizPesama;
    private int brNumera;

    public Album(String naziv, String izvodjac, Date datum) {
        this.naziv = naziv;
        this.izvodjac = izvodjac;
        this.datum = datum;
        this.nizPesama = new MuzickaNumera[5];
        this.brNumera = 0;
    }

    public String getNaziv() {
        return naziv;
    }

    public String getIzvodjac() {
        return izvodjac;
    }

    public Date getDatum() {
        return datum;
    }

    public void dodaj(String name, String trajanje) {
        nizPesama[brNumera] = new MuzickaNumera(name, izvodjac, trajanje);
        brNumera++;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(izvodjac).append(" - ").append(naziv).append("(").append(datum.getYear()).append("):[\n");

        for (MuzickaNumera mn : nizPesama) {
            if (mn != null) {
                str.append("\t").append(mn).append("\n");
            }
        }

        str.append("]: ");

        return str.toString();
    }

}
