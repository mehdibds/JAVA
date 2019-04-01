public class Personne{
    private String nom;
    private static int nbPersonnes =0;
    private static char lettre = 'A';

    public Personne(){
        nbPersonnes ++;
        nom = "Individu" + lettre;
        lettre++;
        // ne pas oublier d'incrémenter la valeur static
        
    }

    public String toString(){
        return nom;
    }

    public static int getNbPersonnes(){
        return nbPersonnes;
    }

}