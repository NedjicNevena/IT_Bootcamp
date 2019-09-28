import java.sql.*;
import java.util.Scanner;

public class studentskaBaza {

	String connectionString;
	Connection conn;

	public void connect() {
		try {
			conn = DriverManager.getConnection(connectionString);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void disconnect() {
		try {
			if (conn != null && !conn.isClosed()) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void dodajStudenta(PreparedStatement ps){
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite indeks: ");
		int indeks = s.nextInt();
		System.out.println("Unesite ime: ");
		String ime = s.next();
		System.out.println("Unesite prezime");
		String prezime = s.next();
		System.out.println("Unesite datum upisa: ");
		String du = s.next();
		System.out.println("Unesite datum rodjenja: ");
		String dr = s.next();
		System.out.println("Unesite mesto rodjenja: ");
		String mr = s.next();
		String upit = ("INSERT INTO dosije (int indeks, String ime, String prezime, "
				+ "LocalDate datum_rodjenja, String mesto_rodjenja"
				+ "\"VALUES indeks = \"" + indeks + "\"ime = \"" + ime + "\"prezime = \"" + prezime
				+ "\" datum_upisa = \"" + du + "\"datum_rodjenja = \"" + dr + "\"mesto_rodjenja = \"" + mr);

		try {
			Statement stm = conn.createStatement();
			ResultSet rs = stm.executeQuery(upit);
			rs.next();
		} catch (SQLException e){
			e.printStackTrace();
		}
		s.close();
	}
}
