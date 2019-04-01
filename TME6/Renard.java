public class Renard extends Animal{
    private static int cpt;
    private int id;

    public Renard(int x,int y){
        super(x, y, "renard");
        cpt++;
        id = cpt;
    }

    public String toString(){
        return String.format("r%02d",id);
    }

    public void afficher(){
        System.out.println(String.format("Type : %s , position : (%d,%d) , identifiant : %d",
        getType(),getX(),getY(),id));
    }

    public void move(Animal a){
        if (a.getType().equals("poule")){
            move((int) Math.signum(-getX() + a.getX()), (int) Math.signum(-getY() + a.getY()));
        }
        if (a.getType().equals("vipere")){
            move((int) Math.signum(getX() - a.getX()), (int) Math.signum(getY() - a.getY()));
        }
    }

}