
public class Pice extends Namirnica {

	private double kolicina;
	private double enVr;

	public Pice(String ime, double kolicina, double enVr) {
		super(ime);
		this.kolicina = kolicina;
		this.enVr = enVr;
	}

	public double getKolicina() {
		return kolicina;
	}

	public double enVr(){
		return enVr * kolicina;
	}

	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("[" + Integer.toString(getId()) + "]").append(getIme()).append(("(" + kolicina + "l ," + enVr + "kJ )"));
		return sb.toString();
	}

	@Override
	public double energVr() {
		return 0;
	}

}
