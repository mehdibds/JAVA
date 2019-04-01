public class TestProjet{
    public static void main(String [] args){
        System.out.println("Avant l'initialisation : " + Personne.getNbPersonnes() + " personnes");
        Personne p1 = new Personne();
        Personne p2 = new Personne();
        System.out.println(p1);
        System.out.println(p2);
        System.out.println("Après l'initialisation : " + Personne.getNbPersonnes() + " personnes");
        Projet projet1 = new Projet("p1");
        System.out.println(projet1);
        Projet projet2 = new Projet("p2");
        System.out.println(projet2);
        System.out.println("Nombre de personnes : " + Personne.getNbPersonnes());
        System.out.println("Nombre de trio(s) crée(s) : " + Trio.getCompteur());
        System.out.println("Nombre de projet(s) crée(s) : " + Projet.getCompteur());
    }
}