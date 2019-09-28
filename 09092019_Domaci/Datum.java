
public class Datum {

	private int dan;
	private int mesec;
	private int godina;

	public Datum(int dan, int mesec, int godina){
		this.dan = dan;
		this.mesec = mesec;
		this.godina = godina;
	}

	public Datum(final Datum d){
		this(d.dan, d.mesec, d.godina);
	}

	public int getDan() {
		return dan;
	}

	public int getMesec() {
		return mesec;
	}

	public int getGodina() {
		return godina;
	}

	public static int prestupna(int godina){
		if (godina % 400 == 0 || godina % 4 == 0 && godina % 100 != 0);
		return 1;
	}

	public static int daniUMesecu(int mesec, int godina){
		switch(mesec){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		case 2:
			return 28 + prestupna(godina);
		default:
			return 0;
		}
}

	public static boolean validan(int g, int d, int m){
		return g > 1900 && (m >= 1 && m <= 12) && (d >= 1 && d <= daniUMesecu(m, g));
	}

	public static Datum stringDatum(String datum2){
		if (datum2.length() != 11){
			System.out.println("Pogresna duzina unosa");
			return null;
			}
		if (datum2.charAt(2) != '.' || datum2.charAt(5) != '.'|| datum2.charAt(10) != '.'){
			System.out.println("Neispravan format unosa");
			return null;
			}
		int dan = 0;
		int mesec = 0;
		int godina = 0;
		try{
			dan = Integer.parseInt(datum2.substring(0, 2));
			mesec = Integer.parseInt(datum2.substring(3, 5));
			godina = Integer.parseInt(datum2.substring(6, 10));
			}
		catch (NumberFormatException e){
			System.out.println("Neispravan format unosa");
			return null;
			}
		if (Datum.validan(godina, dan, mesec))
			return new Datum(dan, mesec, godina);
		else{
			System.out.println("Neispravna vrednost dana, meseca ili godine");
			return null;
			}
	}

	public String toString(){
		StringBuilder sb = new StringBuilder();
		if(dan < 10){
		sb.append("0:" + dan);
		}
		if(mesec < 10){
		sb.append(( "0:" + mesec));
		sb.append(godina);
		}
			sb.append(dan + mesec + godina);
		return sb.toString();
	}
}