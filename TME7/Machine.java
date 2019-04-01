import java.util.ArrayList;
public class Machine{

    private ArrayList<Reservoir> reservoirs;
    private ArrayList<Recette> recettes;
    private double credit;
    private int identifiant;
    private static int compteur;

    public Machine(){
        compteur ++;
        identifiant = compteur;
        reservoirs = new ArrayList<Reservoir>();
        recettes = new ArrayList<Recette>();

    }

    public void ajouterReservoir(Reservoir r){
        reservoirs.add(r);
    }

    public void ajouterRecette(Recette r){
        recettes.add(r);
    }

    public void ajouterCredit(double d){
        credit += d;
    }
    public void rendreLaMonnaie(){
        credit = 0;
    }

    public void remplir(){
        for (Reservoir reservoir : reservoirs){
            if (reservoir != null){
                reservoir.remplir();
            }
        }
    }

    private Reservoir trouverReservoir(Ingredient i){
        for(Reservoir reservoir : reservoirs){
            if (reservoir.getIngredient().equals(i)){
                return reservoir;
            }
        }
        return null;
    }
    // On utilise private parce qu'on appelle depuis la fonction public check-up

    public boolean checkup(){
        for(Recette recette : recettes){
            for(Ingredient ingred : recette.getIngredients()){
                if (trouverReservoir(ingred) == null){
                    return false;
                }
            }
        System.out.println(recette.getNom() + "     OK !");
        }
        return true;
    }

    public boolean commander(int ri){
        if(recettes.size() <= ri){
            System.out.println("Recette inexistante");
            return false;
        }

        Recette recette = recettes.get(ri);
        // on accède a la recette d'indice ri dans l'arraylist recettes.
        if(credit < recette.getPrix()){
            System.out.println("Credit insuffisant");
            // on pourrait également faire une exception
            return false;
        }    
        
        for(int i = 0;i<recette.getIngredients().length;i++){
            Ingredient ingredient = recette.getIngredients()[i];
            double quantite = recette.getQuantites()[i];
            Reservoir reservoir = trouverReservoir(ingredient); 

            /*if (reservoir == null){
                System.out.println("Reservoir de " + ingredient + " indisponible");
                return false;
            }
            */
            try {
                reservoir.recuperer(quantite);
            } catch(RecuperationIngredientException e){
                System.out.println(e);
                return false;
            }
        }
        
        credit -= recette.getPrix();
        return true;
        
    }

    public String getIdentifiant(){
        return "Identifiant de la machine : " + identifiant;
    }

    public double getCredit(){
        return credit;
    }
}