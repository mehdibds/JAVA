public class TestCone{
    public static void main(String[] args){
        Cone c1 = new Cone(5,10);
        Cone c2 = new Cone();
        System.out.println("Cone 1: " + c1 + "\nCone 2: " + c2);
        
        System.out.println("Nombre cones méthode 1 : " + Cone.getNbCones());
        
        
        //System.out.println(new Cone());
    }
}