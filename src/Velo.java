import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Velo {
	private int numeroVelo;
	private int dateService;
	private int idBornette;
	private int id_model;
	public VeloEtat etat;
	static Connection conn;

	public Velo() {
		// TODO Auto-generated constructor stub
	}

	public int getNumeroVelo() {
		return numeroVelo;
	}

	public void setNumeroVelo(int numeroVelo) {
		this.numeroVelo = numeroVelo;
	}

	public int getDateService() {
		return dateService;
	}

	public void setDateService(int dateService) {
		this.dateService = dateService;
	}

	/*
	 * méthode de selection de tous les vélos dont les état sont bon
	 */

	public void selectVeloEtat() {
		Statement stmt;
		ResultSet resultats = null;
		// Requete à executer
		String requete = "SELECT * FROM velo where etat = bon";
		try {
			// Creation de l'objet de la requete
			stmt = conn.createStatement();
			resultats = stmt.executeQuery(requete);

			// affichage des enregistrements existants
			System.out
					.println("** Table Velo **\numeroVelo" + "\t\t" + dateService + "\t\t" + etat + "\t\t" + id_model);

			// Parcours des resulats (objet ResulSet) retournés par executeQuery(requete)
			while (resultats.next()) {
				int numeroVelo = resultats.getInt(1);
				String dateService = resultats.getString(2);
				String etat = resultats.getString(3);
				int id_model = resultats.getInt(4);
				// arrayCages.add("" + noCage);
				System.out.println(numeroVelo + "\t\t" + dateService + "\t\t" + etat + "\t\t" + id_model);
			}
		} catch (SQLException e) {

			System.err.println("failed");
			System.out.println("Affichage de la pile d'erreur");
			e.printStackTrace(System.err);
		} finally {
			// les ReseultSet et les Statement doivent etre mis à null
			resultats = null;
			stmt = null;

		}

	}

}
