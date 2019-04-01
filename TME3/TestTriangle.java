public class TestTriangle{
	public static void main(String[] args){
        Point p1 = new Point(10,10);
        Point p2 = new Point(5,5);
        Point p3 = new Point();
        Triangle triangle = new Triangle(p1,p2,p3);
        
        System.out.println(triangle);
        System.out.println("Longueur p1 à p2 : " + p1.distance(p2));
        System.out.println("Longueur p2 à p3 : " + p2.distance(p3));
        System.out.println("Longueur p3 à p1 : " + p3.distance(p1));
        System.out.println("Périmètre du triangle t : " + triangle.getPerimetre());
        
    }
}