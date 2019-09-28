
public class Ocena {

	private int bodovi;
	private Predmet pr;

	public Ocena (int bodovi, Predmet pr){
		this.bodovi = bodovi;
		this.pr = pr;
	}

	public int getBodovi() {
		return bodovi;
	}

	public Predmet getPr() {
		return pr;
	}

	public int getOcena() {
		if (bodovi > 50 && bodovi < 61 ) {
			return 6;
		} else if (bodovi > 60 && bodovi < 71) {
			return 7;
		} else if (bodovi > 70 && bodovi < 81) {
			return 8;
		} else if (bodovi > 80 && bodovi < 91) {
			return 9;
		} else if (bodovi > 90) {
			return 10;
		} else {
			return 5;
		}
	}

	public String toString() {
		return "Predmet: " + pr.getIme() + ", Ocena: " + getOcena();
	}

}
