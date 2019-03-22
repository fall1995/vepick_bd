 
import java.sql.*;

public class Connexion {

	static final String CONN_URL = "jdbc:oracle:thin:@im2ag-oracle.e.ujf-grenoble.fr:1521:im2ag";

// Ne pas oublier d'anomymiser le PASSWD avant de rendre votre travail

	static final String USER = "sagarai";
	static final String PASSWD = "Sagara1992";
	static Connection conn;

	public static void main(String args[]) {

		try {

			// Enregistrement du driver Oracle
			System.out.print("Loading Oracle driver... ");
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			System.out.println("loaded");

			// Etablissement de la connection
			System.out.print("Connecting to the database... ");
			conn = DriverManager.getConnection(CONN_URL, USER, PASSWD);
			System.out.println("connected");

			conn.setAutoCommit(true);

			// update requette
			System.out.println("------------------");
			// Changer(11,"aquarium\n");

			System.out.println("-----------fin--------");

			// Liberation des ressources et fermeture de la connexion...
			// A COMPLETER
			conn.close();
			// traitement d'exception 
		} catch (SQLException e) {
			System.err.println("failed");
			System.out.println("Affichage de la pile d'erreur");
			e.printStackTrace(System.err);
			System.out.println("Affichage du message d'erreur");
			System.out.println(e.getMessage());
			System.out.println("Affichage du code d'erreur");
			System.out.println(e.getErrorCode());

		}
	}

}