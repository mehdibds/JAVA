public class TestComplexe{
	public static void main(String [] args){
		Complexe c1 = new Complexe();
		Complexe c2 = new Complexe();
		Complexe c3 = new Complexe();
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);
		
		System.out.println("c1 reel: " + c1.estReel());
		System.out.println("c2 reel: " + c2.estReel());
		System.out.println("c3 reel: " + c3.estReel());
		
		System.out.println("c1 + c2 + c3 = " + c1.addition(c2.addition(c3)));
		System.out.println("c1 * c2 * c3 = " + c1.multiplication(c2.multiplication(c3)));
	}
}
