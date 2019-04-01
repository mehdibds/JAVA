public class Tracteur{
	private Roue r1,r2,r3,r4;
	private Cabine cabine;
	
	public Tracteur(Cabine cabine,Roue r1,Roue r2,Roue r3,Roue r4){
		this.cabine = cabine;
		this.r1 = r1;
		this.r2 = r2;
		this.r3 = r3;
		this.r4 = r4;
	}
	
	// constructeur par copie
	// on crée un constructeur qui va prendre en paramètre ce qu'il doit cloner
	// on lui affecte les attributs de la classe
	public Tracteur(Tracteur aCopier){
		this(new Cabine(aCopier.cabine),
		new Roue(aCopier.r1),
		new Roue(aCopier.r2),
		new Roue(aCopier.r3),
		new Roue(aCopier.r4)
		);
	} 
	
	// méthode clone : 
	// on retourne un nouvel objet qui prend les attributs existants
	public Tracteur clone(){
		Roue r1c = r1.clone();
		Roue r2c = r2.clone();
		Roue r3c = r3.clone();
		Roue r4c = r4.clone();
		Cabine cabinec = cabine.clone();
		return new Tracteur(cabinec,r1c,r2c,r3c,r4c);
	}
	
	public Gabriel mechant(){
		this;
	}
		
	public String toString(){
		return "Cabine : " + cabine + "(" + r1 + "," + r2 + "," + r3 + "," + r4 + ")";
	}
	
	public void peindre(String couleur){
		cabine.setCouleur(couleur); 
}
	
}
