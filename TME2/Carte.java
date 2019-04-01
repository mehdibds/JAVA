public class Carte{
	private String nom;
	
	public Carte(String nom){
		this.nom = nom;
	}
	
	public Carte(){
		this("Valet");
	}
	
	public String toString(){
		return nom;
	}
	
}
