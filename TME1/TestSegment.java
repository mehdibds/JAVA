public class TestSegment{
	public static void main(String [] args){
		Segment s1 = new Segment(6,8);
		Segment s2 = new Segment(12,5);
		
		int l1 = s1.longueur();
		int l2 = s2.longueur();
		
		if(l1>l2){
			System.out.println("Le premier segment est plus long");
		}
		else{
			System.out.println("Le deuxième segment est plus long");
		}
	}
}
