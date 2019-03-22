import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Bornette {
	private int numeroBornette;
	public BornetteEtat etat;
	private int idVelo;
	static Connection conn;

	public Bornette() {
		// TODO Auto-generated constructor stub
	}

	public int getNumeroBornette() {
		return numeroBornette;
	}

	public void setNumeroBornette(int numeroBornette) {
		this.numeroBornette = numeroBornette;
	}

	/**
	 * selection des bornettes qui sont occupée ou vide
	 **/
	public void selectBornet() {
		try {
		    PreparedStatement ps;
		    ps = conn.prepareStatement("SELECT * FROM bornettes WHERE etat = ?");
		    ps.setString(1, "VIDE");
		    ResultSet resultats = ps.executeQuery();
		    
		    // Parcours des resulats (objet ResulSet) retournés par executeQuery()
		    boolean encore = resultats.next();
		    while (encore) {
		        System.out.print(resultats.getInt(1) + " : "+resultats.getString(2)+" : "
		        		+resultats.getInt(1)+" : "+resultats.getInt(3));
		        System.out.println();
		        encore = resultats.next();
		    }
		    resultats.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		
	}

}
