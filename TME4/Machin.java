public class Machin{
	private String nom;
	private int v; 
	
	public Machin(String n, int v){
		nom=n;
		this.v=v;
	}
	public Machin(){
		nom="Telephone";
		v=(int)Math.random()*4;

	}
	public String getNom(){
		return nom;
	}

	public int getValue(){
		return v;
	}
}

