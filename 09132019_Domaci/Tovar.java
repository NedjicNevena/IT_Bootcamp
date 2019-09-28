
public abstract class Tovar {

	public Tovar() {};

	public abstract String getVrsta();

	public abstract double getTezina();

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getVrsta() + "(" + getTezina() + ")");
		return sb.toString();
	}

}
