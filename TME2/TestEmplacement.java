public class TestEmplacement{
	public static void main(String [] args){
		Emplacement e = new Emplacement("Emplacement");
		Carte c = new Carte();
		
		e.poser(c);
		System.out.println(e);
		
		e.enlever();
		System.out.println(e);
	}
}
