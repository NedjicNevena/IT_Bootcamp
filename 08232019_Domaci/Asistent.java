import java.util.Date;

public class Asistent extends Nastavnik {

	private String smerStud;

	public Asistent(String ime, String prezime, int godineRodj, Date godZaposlenja, int plata, String omiljeniP,
			String[] predmet, String smerStud) {
		super(ime, prezime, godineRodj, godZaposlenja, plata, omiljeniP, predmet);
		this.smerStud = smerStud;
	}

	public String getSmerStud() {
		return smerStud;
	}

	public String toString(){
		StringBuilder str = new StringBuilder();
		str.append(super.getIme()+" ").append(super.getPrezime()+" ").append(super.getGodinaRodj()+" ").append(super.getGodZaposlenja()+" ").append(super.getPlata()+" ").append(super.getOmiljeniP()+" ").append(super.getPredmet()+" ").append(smerStud);
		return str.toString();
	}

}
