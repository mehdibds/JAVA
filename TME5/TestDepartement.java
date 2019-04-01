public class TestDepartement{
    public static void main(String [] args){
        int nb_DPT = 75;
        for(int i = 1;i<20000;i++){
            System.out.println("Plaque " + i + " générée : " + Departement.genere(nb_DPT));
        }

    }
}