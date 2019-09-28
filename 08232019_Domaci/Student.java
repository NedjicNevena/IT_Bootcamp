import java.time.LocalDate;

public class Student extends Covek {

	private LocalDate godStudija = LocalDate.now();
	private int trenProsek;


	public Student(String ime, String prezime, int godineRodj,LocalDate godStudija, int trenProsek) {
		super(ime, prezime, godineRodj);
		this.godStudija = godStudija;
		this.trenProsek = trenProsek;
	}

	public LocalDate getGodStudija() {
		return godStudija;
	}


	public int getTrenProsek() {
		return trenProsek;
	}

}
