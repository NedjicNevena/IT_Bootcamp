
import java.time.LocalDate;
import java.util.Arrays;

public class Student {

	private String potpis;
	private String jmbg;
	private Ocena[] upisaneOcene;

	public Student(String potpis, String jmbg, Ocena[] upisaneOcene) {
		this.potpis = potpis;
		this.jmbg = jmbg;
		this.upisaneOcene = upisaneOcene;
	}

	public String getPotpis() {
		return potpis;
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setPotpis(String potpis) {
		this.potpis = potpis;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public double getProsecnaOcena() {
		double sumaOcena = 0;
		int brPolozenihPredmeta = 0;

		for (int i = 0; i < upisaneOcene.length; i++) {
			if (upisaneOcene[i].getOcena() > 5) {
				sumaOcena += upisaneOcene[i].getOcena();
				brPolozenihPredmeta++;
			}
		}

		return sumaOcena / brPolozenihPredmeta;
	}

	public String getDatumRodjenja() {
		StringBuilder datumRodjenja = new StringBuilder();
		String deoJMBG = jmbg.substring(0, 7);
		datumRodjenja.append(deoJMBG.substring(0, 2)).append(".").append(deoJMBG.substring(2, 4)).append(".");

		String deoGodine = deoJMBG.substring(4);

		if (Integer.parseInt(deoGodine) < 20) {
			datumRodjenja.append("2").append(deoGodine);
		} else {
			datumRodjenja.append("1").append(deoGodine);
		}

		datumRodjenja.append(".");

		return datumRodjenja.toString();
	}

	public String getIme() {
		String[] imePrezime = potpis.split(" ");
		return imePrezime[0];
	}

	public String getPrezime() {
		String[] imePrezime = potpis.split(" ");
		return imePrezime[1];
	}

	public String najboljaOcena() {
		Ocena najboljaOcena = upisaneOcene[0];

		for (int i = 1; i < upisaneOcene.length; i++) {
			if (upisaneOcene[i].getBodovi() > najboljaOcena.getBodovi()) {
				najboljaOcena = upisaneOcene[i];
			}
		}

		return najboljaOcena.getPr().getIme();
	}

	static boolean starijiOd(Student s, int god) {
		LocalDate danas = LocalDate.now();
		int trenutnaGodina = danas.getYear();

		int godisteStudenta = Integer.parseInt((s.getDatumRodjenja()).split("\\.")[2]);
		int godineStudenta = trenutnaGodina - godisteStudenta;

		if (godineStudenta >= god) {
			return true;
		}

		return false;

	}

	static Student[] prosekVeciOd(Student[] nizStudenata, double ocena) {
		Student[] najStudenti = new Student[nizStudenata.length];
		int i = 0;
		for (Student s : nizStudenata) {

			if (s.getProsecnaOcena() > ocena) {
				najStudenti[i] = s;
				i++;
			}
		}

		Student[] bezNullVrednosti = new Student[najStudenti.length];
		int brojac = 0;
		for (Student ns : najStudenti) {
			if (ns != null) {
				bezNullVrednosti[brojac] = ns;
				brojac++;
			}
		}

		najStudenti = Arrays.copyOf(bezNullVrednosti, brojac);

		return najStudenti;

	}

}
