public class TestPoint{
	public static void main(String[] args){
		Point p1 = new Point(0,0);
		Point p2 = new Point(10,10);
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println("Distance :" + p1.distance(p2));
	}
	
}
