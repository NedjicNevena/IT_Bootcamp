import java.util.Date;

public class Sluzbenik extends Zaposleni{

	private String odsek;

	public Sluzbenik(String ime, String prezime, int godineRodj, Date godZaposlenja, int plata, String odsek) {
		super(ime, prezime, godineRodj, godZaposlenja, plata);
		this.odsek = odsek;
	}

	public String getOdsek() {
		return odsek;
	}

	public String toString() {
		StringBuilder str= new StringBuilder();
		str.append(getIme()).append(getPrezime()).append(getGodinaRodj()).append(getGodZaposlenja()).append(getPlata()).append(getOdsek());
		return str.toString();
	}

}
