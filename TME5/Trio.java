public class Trio{
    private Personne[]tableau = new Personne[3]  ;
    private static int compteur = 0;
    private int nb ;

    public Trio(){
        for(int i = 0;i<tableau.length;i++){
            tableau[i] = new Personne();
            
        }
        compteur ++;
        nb = compteur;
    }

    public String toString(){
        return "Trio " + nb + ":" + tableau[0] + " " + tableau[1] + " " + tableau[2] ;
    }

    public static int getCompteur(){
        return compteur;
    }

}