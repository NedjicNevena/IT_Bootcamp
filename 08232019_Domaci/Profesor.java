import java.util.Date;

public class Profesor extends Nastavnik {

	private String titula;

	public Profesor(String ime, String prezime, int godineRodj, Date godZaposlenja, int plata, String omiljeniP,
			String[] predmet, String titula) {
		super(ime, prezime, godineRodj, godZaposlenja, plata, omiljeniP, predmet);
		this.titula = titula;
	}

	public String getTitula() {
		return titula;
	}

	public String toString(){
		StringBuilder str = new StringBuilder();
		str.append(super.getIme()+" ").append(super.getPrezime()+" ").append(super.getGodinaRodj()+" ").append(super.getGodZaposlenja()+" ").append(super.getPlata()+" ").append(super.getOmiljeniP()+" ").append(super.getPredmet()+" " ).append(titula);
		return str.toString();
	}
}
