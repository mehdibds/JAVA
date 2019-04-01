public class TestTrianglePascal{
	public static void main (String[] args){
		TrianglePascal t1= new TrianglePascal(5);
		TrianglePascal t2= new TrianglePascal(7);
		t1.remplirTriangle();
		t2.remplirTriangle();
		System.out.println(t1);
		System.out.println(t2);
	}
}
