public class Triangle{
    private Point point1;
    private Point point2;
    private Point point3;

    public Triangle(){
        this(new Point(5,5),new Point(2,2),new Point(7,7));
    }
    public Triangle(Point point1, Point point2, Point point3){
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }
    public double getPerimetre(){
        return point1.distance(point2)+ point2.distance(point3)+ point3.distance(point1);
    }
    public String toString(){
		return "Triangle T de point 1 : " + point1 + ", de point 2 : " + point2 + ", de point 3 : " + point3;
	}





}