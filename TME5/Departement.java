public class Departement{
    private static int NUM_DEPARTEMENT;
    private static int compteur_dpt;
    private static int NUM = 0;
    private static char lettre1 = 'A';
    private static char lettre2 = 'A'; 

    public static String genere(int Numero_Departement){
        compteur_dpt = Numero_Departement;
        NUM_DEPARTEMENT = compteur_dpt;

        if (NUM==999){
            NUM = 0;
            lettre2++;
        }
        if(lettre2 == 'Z'){
            lettre1++;
            lettre2 ='A';
        }
        
        NUM++;
        String string = (NUM + "  " + lettre1 + lettre2 + "  " + NUM_DEPARTEMENT);

        return string;
    
    }
}