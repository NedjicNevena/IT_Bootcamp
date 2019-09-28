import java.util.ArrayList;

public class Paket extends Tovar {

	private ArrayList<Tovar> tovar = new ArrayList <Tovar>();

	public Paket() {};

	public String getVrsta() {
		StringBuilder sb = new StringBuilder();
		sb.append("paket[");

		for (Tovar t : tovar) {
		    sb.append(t.getVrsta()).append(",");
		}

		sb.append("]");

		return sb.toString();
	}

	public double getTezina() {
		double ukupnaTezina = 0;

		for (Tovar t : tovar) {
		    ukupnaTezina += t.getTezina();
		}

		return ukupnaTezina;
	}

	public void dodaj(Tovar t) {
		tovar.add(t);
	}

}
