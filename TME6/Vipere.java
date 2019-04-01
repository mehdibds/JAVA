public class Vipere extends Animal{
    private static int cpt;
    private int id;

    public Vipere(int x,int y){
        super(x, y, "vipere");
        cpt++;
        id = cpt;
    }

    public String toString(){
        return String.format("v%02d",id);
    }

    public void afficher(){
        System.out.println(String.format("Type : %s , position : (%d,%d) , identifiant : %d",
        getType(),getX(),getY(),id));
    }

    public void move(Animal a){
        if (a.getType().equals("renard")){
            move((int) Math.signum(-getX() + a.getX()), (int) Math.signum(-getY() + a.getY()));
        }
        if (a.getType().equals("poule")){
            move((int) Math.signum(getX() - a.getX()), (int) Math.signum(getY() - a.getY()));
        }
    }

}