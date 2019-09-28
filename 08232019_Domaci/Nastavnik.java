import java.util.Date;

public class Nastavnik extends Zaposleni{

	private String omiljeniP;
	private String predmet[];

	public Nastavnik(String ime, String prezime, int godineRodj, Date godZaposlenja, int plata, String omiljeniP, String predmet[]) {
		super(ime, prezime, godineRodj, godZaposlenja, plata);
		this.omiljeniP = omiljeniP;
		this.predmet = new String[5];
	}

	public String getOmiljeniP() {
		return omiljeniP;
	}

	public String[] getPredmet() {
		return predmet;
	}

	public void dodajPredmet(String omiljeniP){
		for(int i = 0; i < predmet.length; i++){
			if(predmet[i].equals(null)){
				predmet[i] = omiljeniP;
			} else {
				continue;
			}
		}
		String predmet2[]= new String[predmet.length * 2];
		for(int i = 0; i < predmet.length;i++){
				 predmet2[i] = predmet[i];
		}
	}
}
