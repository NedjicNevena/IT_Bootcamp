import java.time.LocalDate;

public class StudentM extends Student{

	private String smerMa;

	public StudentM(String ime, String prezime, int godineRodj, LocalDate godStudija, int trenProsek, String smerMa) {
		super(ime, prezime, godineRodj, godStudija, trenProsek);
		this.smerMa = smerMa;
	}

	public String getSmerMa() {
		return smerMa;
	}


	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append(getIme()).append(getPrezime()).append(getGodinaRodj()).append(getGodStudija()).append(getTrenProsek()).append(getSmerMa());
		return str.toString();
	}



}
