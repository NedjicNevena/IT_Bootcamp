
public class Predmet extends Tovar {

	private String vrsta;
	private double tezina;

	public Predmet(String vrsta, double tezina) {
		super();
		this.vrsta = vrsta;
		this.tezina = tezina;
	}

	public String getVrsta() {
		return this.vrsta;
	}

	public double getTezina() {
		return this.tezina;
	}

	public String toString() {
		return super.toString();
	}

}
