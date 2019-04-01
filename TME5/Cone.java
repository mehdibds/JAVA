public class Cone{
    private double r;
    private double h;
    public static final double PI = 3.14159;
    private static int nbCones = 0;

    public Cone(double r,double h){
        this.r = r;
        this.h =h;
        nbCones ++;
    }
    public Cone(){
        this(Math.random()*10,Math.random()*10);
    }
    public double getVolume(){
        return (PI*r*r*h)/3.0;
    }
    public String toString(){
        //return String.format("Cone r = {.2} h = {.2} V = {.5}", r, h, getVolume());
        return "Cone r = " + r + " h = " + h + " V = " + getVolume();

    }

    public static int getNbCones(){
        return nbCones;
    }


}