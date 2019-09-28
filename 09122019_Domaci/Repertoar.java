
import java.util.ArrayList;

public class Repertoar {
    private Pozoriste pozoriste;
    private ArrayList<Predstava> predstave = new ArrayList<>();

    public Repertoar(Pozoriste pozoriste) {
        this.pozoriste = pozoriste;
    }

    public void dodaj(Predstava p) {
        predstave.add(p);
    }

    public void ukloni(String imePredstave) {
        int index = -1;

        for (Predstava pTemp: predstave) {
            if (pTemp.getNaziv() == imePredstave) {
                index = predstave.indexOf(pTemp);
            }
        }

        predstave.remove(index);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(pozoriste.getNaziv() + ": [\n");

        for (Predstava p: predstave) {
            sb.append("\t" + p.toString() + "\n");
        }

        sb.append("]");

        return sb.toString();
    }

}
