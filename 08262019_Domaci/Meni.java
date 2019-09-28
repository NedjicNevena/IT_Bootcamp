
public class Meni {

	private Namirnica[] nizNam;
	private int brNam;

	public Meni(int brNam){
		this.brNam = brNam;
		nizNam = new Namirnica [brNam];
	}

	public void dodaj(Namirnica n){
		for(int i = 0; i < nizNam.length; i++){
			nizNam[i] = n;
			brNam--;
		}
	}

	public double ukupnaEnVr(){
		double ukupno = 0;
		for(Namirnica n : nizNam){
			if(n == null)
				continue;
			ukupno += n.energVr();
		}
		return ukupno;
	}

	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Meni: (" + Math.round(ukupnaEnVr()) + " kJ)");
		for(int i = 0; i < nizNam.length; i++){
			sb.append("\n" + nizNam[i]);
		}
		return sb.toString();
	}
}
