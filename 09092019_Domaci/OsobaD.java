import java.util.Date;

public class OsobaD extends Osoba {

	private Datum datum;

	public OsobaD(String ime, String rezime, String adresa, Datum d) {
		super(ime, rezime, adresa);
		this.datum = new Datum(d);
	}

	public OsobaD(final OsobaD o){
		super(o.getIme(), o.getPrezime(), o.getAdresa());
		datum = new Datum(o.datum);
	}

	public Datum getDatum() {
		return datum;
	}

	public int numeroloskiBroj(){
		int suma = zbirCifara(datum.getDan()) + zbirCifara(datum.getMesec()) + zbirCifara(datum.getGodina());
		while (suma > 9)
		suma = zbirCifara(suma);
		return suma;
	}

	public String metabolizam(final Datum d){
		int zbir = (datum.getDan() + d.getDan()) * 1000000 +
				(datum.getMesec() + d.getMesec()) * 10000 +
				datum.getGodina() + d.getGodina();

		String rezultat = String.valueOf(zbir);
		if (rezultat.length() == 7)
			rezultat = "0" + rezultat;
		return rezultat;
	}

	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Numeroloski broj: " + numeroloskiBroj());
		return sb.toString();
	}

}
