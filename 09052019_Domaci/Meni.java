import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Meni {

	Connection conn;
	Statement stm;
	//Statement statement = conn.createStatement();

	public static void main(String[] args) {

		studentskaBaza sb = new studentskaBaza("jdbc:sql:C:\\Users\\Wonderwall\\Desktop\\Domaci 7-me nedelje\\09052019-Domaci");

	}

	
}
