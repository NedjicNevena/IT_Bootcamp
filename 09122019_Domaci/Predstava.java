
import java.util.ArrayList;

public class Predstava {

    private String naziv;
    private Pozoriste pozoriste;
    private ArrayList<Zaposleni> zaposleni = new ArrayList<>();

    public Predstava(String naziv, Pozoriste pozoriste, Reditelj r) {
        this.naziv = naziv;
        this.pozoriste = pozoriste;
        this.zaposleni.add(r);
    }

    public boolean dodaj(Glumac g) {
        zaposleni.add(g);

        return true;
    }

    public boolean dodaj(Kostimograf k) {
        int brKostimografa = 0;

        for (Zaposleni z: zaposleni) {
            if (z.imePosla() == "Kostimograf") {
                brKostimografa++;
            }
        }

        if (brKostimografa >= 2) {
            return false;
        }

        zaposleni.add(k);

        return true;
    }

    public String getNaziv() {
        return naziv;
    }

    public Pozoriste getPozoriste() {
        return pozoriste;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(naziv + ":\n");

        for (Zaposleni z: zaposleni) {
            sb.append("\t" + z.toString() + "\n");
        }

        return sb.toString();
    }
}
