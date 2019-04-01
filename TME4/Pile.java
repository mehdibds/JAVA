public class Pile{
	private Machin [] pile;
	private int sommet;	
	
	public Pile(int n){
		pile= new Machin[n];
		sommet=0;
	}

	public void empiler(Machin m){
		if (! (estPleine())){
			pile[sommet]=m;
			sommet+=1;
		}
		else 
			System.out.println("Pile deja pleine");
	}
	
	public Machin depiler(){
		if (estVide()){
			System.out.println("pile deja vide");
			return null;
		} 
		else {
			Machin mTemp= pile[sommet-1];
			pile[sommet-1]=null;
			sommet--;
			return mTemp;
		}
	}

	public boolean estVide(){
		return sommet==0;
	}	

	public boolean estPleine(){
		return sommet== pile.length;
	}

	public String toString(){
		String ch= new String("");		
		for (int s=sommet-1; s>=0; s--){
			ch+= pile[s].getNom() + "\n";
		}		
		return ch;
	}
	
}
