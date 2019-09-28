
public class Pozoriste {

    private int id;
    private String naziv;
    private static int brojac = 0;

    public Pozoriste(String naziv) {
        this.naziv = naziv;
        this.id = ++brojac;
    }

    public int getId() {
        return id;
    }

    public String getNaziv() {
        return naziv;
    }

    public String getSkraceniNaziv() {
        String[] nazivArr = naziv.split(" ");
        String skraceniNaziv = "";

        for (String str : nazivArr) {
            skraceniNaziv += str.charAt(0);
        }

        return skraceniNaziv.toUpperCase();
    }

    public String toString() {
        return naziv + " [" + id + "]";
    }

}
