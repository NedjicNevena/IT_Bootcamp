
public class Main {

	public static void main(String[] args) {

		FudbalskiSavez fs = new FudbalskiSavez("jdbc:sqlite:C:\\Users\\Wonderwall\\Desktop\\Domaci 7-me nedelje\\09062019-domaci");

		fs.connect();
		fs.ispisiImena();
		fs.imenaFudbaleraMU();
		fs.golovi();
		fs.fudbalerGoloviMax();
		fs.brojKartona();
		fs.dissconect();

	}

}
