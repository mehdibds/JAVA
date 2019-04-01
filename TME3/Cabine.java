public class Cabine{
	private double volume;
	private String couleur;
	
	public Cabine(double volume,String couleur){
		this.volume = volume;
		this.couleur = couleur;
	}
	// constructeur par copie
	public Cabine(Cabine cabine){
		this(cabine.volume,cabine.couleur);
	}
	public String toString(){
		return "volume : " + volume + ",couleur : " + couleur;
	}
	
	public void setCouleur(String couleur){
		this.couleur = couleur;
	}
	// clone
	public Cabine clone(){
		return new Cabine(volume, couleur);	
	}
}
