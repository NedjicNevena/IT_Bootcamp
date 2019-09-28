import java.sql.*;

public class FudbalskiSavez {

	String connectionString;
	Connection conn;

	public FudbalskiSavez(String connectionString) {
		this.connectionString = connectionString;
	}

	public void connect() {
		try {
			conn = DriverManager.getConnection(connectionString);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void dissconect() {
		try {
			if (conn != null && !conn.isClosed()) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void ispisiImena() {
		String upit = "SELECT Fudbaler.Ime, Tim.Naziv FROM Fudbaler, Tim WHERE Fudbaler.IdTim = Tim.IdTim";

		try {
			Statement stm = conn.createStatement();
			ResultSet rs = stm.executeQuery(upit);

			while (rs.next()) {
				String ime = rs.getString("Ime");
				String naziv = rs.getString("Naziv");

				System.out.println("\t" + ime + "\t\t" + naziv);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void imenaFudbaleraMU() {
		String upit = "SELECT Fudbaler.Ime FROM Fudbaler, Tim WHERE Fudbaler.IdTim=Tim.IdTim AND Tim.Naziv = \"Manchester United\"";

		try {

			Statement stm = conn.createStatement();
			ResultSet rs = stm.executeQuery(upit);

			while (rs.next()) {
				String ime = rs.getString("Ime");

				System.out.println("\t" + ime);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void golovi() {
		String upit = "SELECT Fudbaler.Ime, COUNT(Gol.RedniBrGola)\n" + "FROM Fudbaler, Gol\n"
				+ "WHERE Fudbaler.IdFud = Gol.IdFud\n" + "GROUP BY Fudbaler.Ime\n" + "ORDER BY Gol.IdGol";

		try {
			Statement stm = conn.createStatement();
			ResultSet rs = stm.executeQuery(upit);

			while (rs.next()) {
				String ime = rs.getString("Ime");
				int gol = rs.getInt(2);

				System.out.println("\t" + ime + "\t" + gol);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void fudbalerGoloviMax() {
		String upit = "SELECT Fudbaler.Ime, COUNT(Gol.IdGol)\n" + "FROM Fudbaler, Gol\n"
				+ "WHERE Fudbaler.IdFud = Gol.IdFud \n" + "GROUP BY Fudbaler.Ime\n"
				+ "HAVING COUNT(Gol.IdGol) = (SELECT MAX(maxGolova) FROM (SELECT COUNT(Gol.RedniBrGola) AS maxGolova FROM Fudbaler, Gol WHERE Fudbaler.IdFud = Gol.IdFud GROUP BY Fudbaler.Ime))";

		try {
			Statement stm = conn.createStatement();
			ResultSet rs = stm.executeQuery(upit);

			while (rs.next()) {
				System.out.println(rs.getString("Ime") + "\t" + rs.getInt(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void brojKartona() {
		String upit = "SELECT Fudbaler.Ime, COUNT(CASE WHEN Karton.Tip = \"zuti karton\" THEN 1 ELSE NULL END) AS Zuti_Karton,"
				+ " COUNT(CASE WHEN Karton.Tip = \"crveni karton\" THEN 1 ELSE NULL END) AS Crveni_Karton\n"
				+ "FROM Fudbaler, Karton\n" + "WHERE Fudbaler.IdFud = Karton.IdFud\n" + "GROUP BY Fudbaler.Ime";

		try {
			Statement stm = conn.createStatement();
			ResultSet rs = stm.executeQuery(upit);

			while (rs.next()) {
				System.out.println(rs.getString("Ime") + "\t" + rs.getInt(2) + "\t" + rs.getInt(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
