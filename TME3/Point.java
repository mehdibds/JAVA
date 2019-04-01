public class Point{
	private double posx;
	private double posy;
	
	public Point(){
		this(0,0);
	}
	
	public Point(double posx,double posy){
		this.posx = posx;
		this.posy = posy;
	}
	public void setPosx(double posx){
		this.posx = posx;
	}
	public void setPosy(double posy){
		this.posy = posy;
	}
	public double getPosx(){
		return posx;
	}
	public double setPosy(){
		return posy;
	}
	public String toString(){
		return "(" + posx + "," + posy + ")" ;
	}
	public double distance(Point p){
		return Math.sqrt((p.posx - posx)*(p.posx - posx) + (p.posy - posy)*(p.posy - posy));
	}
	public void deplacetoi(int newx, int newy){
		posx = newx;
		posy = newy;
	}
	

}
