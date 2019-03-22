
public enum BornetteEtat {
	VIDE("vide"),
	OCCUPEE("occupée");
	
	String nom;
	
	private BornetteEtat(String nom) {
		this.nom = nom;
	}
	
	public String getBornetteEtat() {
		return nom;
	}

}
