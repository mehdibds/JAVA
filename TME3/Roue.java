public class Roue{
	private int diametre;
	
	public Roue(int diametre){
		this.diametre = diametre;
		
	}
	
	public Roue(){
		this(60);
	}
	// constructeur par copie :
	// on crée un constructeur qui va prendre en paramètre ce qu'il doit cloner
	// on lui affecte les attributs de la classe
	public Roue(Roue aCopier){
		this(aCopier.diametre);
	}
	
	
	public String toString(){
		return "roue de diametre " + diametre + " cm" ;
	}
	// méthode clone : 
	// on retourne un nouvel objet qui prend les attributs existants
	public Roue clone(){
		return new Roue(diametre);

	}

}
