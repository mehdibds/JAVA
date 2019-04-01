public abstract class Planete{
    
    protected String nom;
    protected static int cpt = 0;
    protected int rang;
    
    public Planete(String nom){
        cpt ++;
        rang = cpt;
        this.nom = nom;   
    }
    public int getRang(){
        return rang;
    }
    public abstract boolean hasAnneaux();

    public String toString(){
        return nom + " [anneaux= " + hasAnneaux() + " , rang =  " + rang + "]";
    }

}
