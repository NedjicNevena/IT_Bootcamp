import java.util.ArrayList;

public class Kamion {

	private String regBroj;
	private double nosivost;
	private double teret;
	private ArrayList<Tovar> tovar = new ArrayList<Tovar>();

	public Kamion(String regBroj, double nosivost) {
		this.regBroj = regBroj;
		this.nosivost = nosivost;
		this.teret = 0;
	}

	public boolean stavi(Tovar t) {
		if ((t.getTezina() + this.teret) > nosivost) {
			return false;
		}

		tovar.add(t);
		this.teret += t.getTezina();

		return true;
	}

	public void skini() {
		if (tovar.size() > 0)
			tovar.remove(tovar.size() - 1);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append(regBroj + "(" + teret + "/" + nosivost).append(")\n");

		for (Tovar tTemp : tovar) {
			sb.append(tTemp.toString()).append("\n");
		}

		return sb.toString();

	}
}
