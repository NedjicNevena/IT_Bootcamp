import java.util.Date;

public class Zaposleni extends Covek {

	private Date godZaposlenja;
	private int plata;

	public Zaposleni(String ime, String prezime, int godineRodj, Date godZaposlenja, int plata) {
		super(ime, prezime, godineRodj);
		this.godZaposlenja = godZaposlenja;
		this.plata = plata;
	}

	public Date getGodZaposlenja() {
		return godZaposlenja;
	}

	public int getPlata() {
		return plata;
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append(super.getIme()+" ").append(super.getPrezime()+" ").append(super.getGodinaRodj()+" ").append(getGodZaposlenja()+" ").append(getPlata()+" ");
		return str.toString();
	}



}
