
public class Pravougaonik {

	private double a;
	private double b;
	private String ime;

	public Pravougaonik(double a, double b, String ime){
		this.a = a;
		this.b = b;
		this.ime = ime;
	}
	public Pravougaonik(double a, String ime){
		this.a = a;
		this.b = a;
		this.ime= ime;
	}
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public String getIme() {
		return ime;
	}

	public double getObim() {
		return 2 * a + 2 * b;
	}

	public double getPovrsina() {
		return a * b;
	}

	public String ispisiPravougaonik() {
		String ispis = "";
		ispis += "Ime: " + ime;
		ispis += "\nDuzina prve stranice je: " + a + "\nDuzina druge stranice je: " + b;
		ispis += "\nPovrsina pravougaonika je: " + getPovrsina();
		ispis += "\nObim pravougaonika je: " + getObim();
		return ispis;
	}




}
