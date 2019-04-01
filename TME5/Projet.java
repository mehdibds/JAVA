public class Projet{

    private String nom;
    private Trio trio;
    private static int compteur=0;

    public Projet(String nom){
        this.nom = nom;
        trio = new Trio();
        compteur++;
    }
    public String toString(){
        return "Projet " + nom + " " + trio;
    }
    public static int getCompteur(){
        return compteur;
    }
}