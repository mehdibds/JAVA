import java.lang.Math;

public class Jeu{
	private Emplacement gauche,milieu,droit;
	private Carte cible;
	
	public Jeu(){
		cible = new Carte("Dame");
		gauche = new Emplacement("gauche", new Carte());
		milieu = new Emplacement("milieu", cible);
		droit = new Emplacement("droit", new Carte());
	}

	public String toString(){
		return "carte de gauche:" + gauche + "carte du milieu" + milieu + "carte de droite" + droit;
	}
	public void echanger(Emplacement a,Emplacement b){
		Carte temp1 = a.enlever();
		Carte temp2 = b.enlever();
		a.poser(temp2);
		b.poser(temp1);
	}

	public void echanger(int i,int j){
		if (i+j==1){
			echanger(gauche, milieu);
		}
		if (i+j==2){
			echanger(gauche,droit);
		}
		else{
			echanger(milieu,droit);
		}
	}

	public boolean choisir(Emplacement a){
		Carte temp = a.enlever();
		a.poser(temp);
		return temp == cible;
	}

	public boolean choisir(int i){
		if (i==0){
			return choisir(gauche);
		}
		if (i==1){
			return choisir(milieu);
		}
		else{
			return choisir(droit);
		}
	}
	
	public void melanger(){
		int rand = (int)Math.random()*3;
		if (rand ==0){
			echanger(1,2);
		}
		if (rand == 1){
			echanger(0,1);	
		}
		else{
			echanger(0,2);
		}
	}

	public void melanger(int n){
		for(int i=0;i<n;i++){
			melanger();
		}
	}
}


