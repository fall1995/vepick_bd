
public enum VeloEtat {
	BON("bon"),
	MAUVAIS("mauvais");
	
	String nom;
	
	private VeloEtat(String nom) {
		this.nom = nom;
	}
	
	public String getNom() {
		return nom;
	}
	

}
