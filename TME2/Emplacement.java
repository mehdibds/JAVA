public class Emplacement{
	private Carte carte;
	private String nom;
	
	public Emplacement(String nom, Carte carte){
		this.nom = nom;
		this.carte = carte;
	}

	public Emplacement(String nom){
		this(nom, null);
	}
	
	public String toString(){
		return nom + ":" + carte;
	}
	
	public boolean estVide(){
		return carte == null;
	}
	
	public boolean poser(Carte carte){
		if (estVide()){
			this.carte = carte;
			return true;
		}
		else {
			return false;
		}
	}
	
	public Carte enlever(){
		if(estVide()){
			return null;
		}
		else {
			Carte temp = carte;
			carte = null;
			return temp;
		}		

	}
}
