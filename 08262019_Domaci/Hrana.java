
public class Hrana extends Namirnica {

	private double tezina;
	private double belancevine;
	private double masti;
	private double ugHidrati;

	public Hrana(String ime, double tezina, double belancevine, double masti, double ugljHidrati) {
		super(ime);
		if (belancevine + masti + ugHidrati <= 100) {
		this.tezina = tezina;
		this.belancevine = belancevine;
		this.masti = masti;
		this.ugHidrati = ugljHidrati;
		}
	}

	public double getTezina() {
		return tezina;
	}

	public double getBelancevine() {
		return belancevine;
	}

	public double getMasti() {
		return masti;
	}

	public double getUgljHidrati() {
		return ugHidrati;
	}

	public double energVr() {
			double ukupno = 0;
			ukupno += (16.7 * (belancevine * tezina / 100));
			ukupno += (37.6 * (masti * tezina / 100));
			ukupno += (17.2 * (ugHidrati * tezina / 100));
			return ukupno;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[" + Integer.toString(getId()) + "]").append(getIme() + "(" + tezina + "g" + energVr() + "kJ)");
		return sb.toString();
	}
}
