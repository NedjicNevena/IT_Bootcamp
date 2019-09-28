import java.time.LocalDate;

public class StudentO extends Student{

	private String smerOs;

	public StudentO(String ime, String prezime, int godineRodj, LocalDate godStudija, int trenProsek, String smerOs) {
		super(ime, prezime, godineRodj, godStudija, trenProsek);
		this.smerOs = smerOs;
	}

	public String getSmerOs() {
		return smerOs;
	}

	public String toString(){
	StringBuilder str = new StringBuilder();
	str.append(getIme()).append(getPrezime()).append(getGodinaRodj()).append(getGodStudija()).append(getTrenProsek()).append(getSmerOs());
	return str.toString();
	}
}
