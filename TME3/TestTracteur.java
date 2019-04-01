public class TestTracteur{
	public static void main(String[] args){
		Roue r1 = new Roue(120);
		Roue r2 = new Roue(120);
		Roue r3 = new Roue();
		Roue r4 = new Roue();
		
		Cabine bluecab = new Cabine(2,"bleue");
		Tracteur t1 = new Tracteur(bluecab,r1,r2,r3,r4);
		Tracteur t2 = t1.clone();
		t2.peindre("blanc");
		Tracteur t3 = new Tracteur(t1);
		t3.peindre("rouge");
		System.out.println("t1: " + t1);
		System.out.println("t2: " + t2);
		System.out.println("t3: " + t3);
		
		
	}
}
