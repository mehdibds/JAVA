public class TestPile{
	public static void main(String[] args){
		Machin m1=new Machin("balle", 3);
		Machin m2=new Machin("Verre",5);
		Machin m3=new Machin();
		Pile p=new Pile(5);
		p.empiler(m1);
		p.empiler(m2);
		p.empiler(m3);
		System.out.println("Affichage de pile (apres 3 empilations):\n"+ p.toString());
		Machin ma1=p.depiler();
		Machin ma2=p.depiler();
		System.out.println("Affichage de pile (apres 2 dépilations):\n"+ p.toString());
		p.empiler(new Machin("souris",6));
		System.out.println("Affichage de pile (apres une empilations):\n"+ p.toString());
	}
}
