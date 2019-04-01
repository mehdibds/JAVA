public class Poule extends Animal{
    private static int cpt;
    private int id;

    public Poule(int x,int y){
        super(x, y, "poule");
        cpt++;
        id = cpt;
        // Anecdote : on peut utiliser des variables de classe dans des méthodes non statiques.
    }

    public String toString(){
        return String.format("p%02d",id);
    }

    public void afficher(){
        System.out.println(String.format("Type : %s , position : (%d,%d) , identifiant : %d",
        getType(),getX(),getY(),id));
    }

    public void move(Animal a){
        if (a.getType().equals("vipere")){
            move((int) Math.signum(-getX() + a.getX()), (int) Math.signum(-getY() + a.getY()));
        }
        if(a.getType().equals("renard")){
            move((int) Math.signum(getX() - a.getX()), (int) Math.signum(getY() - a.getY()));
        }
    }


}