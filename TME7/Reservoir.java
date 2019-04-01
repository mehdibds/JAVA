public class Reservoir{
    private Ingredient ingredient;
    private double capacite;
    private double niveau;

    public Reservoir(Ingredient ingredient,double capacite){
        this.capacite = capacite;
        niveau = capacite;
        this.ingredient = ingredient;
    }

    // accesseur sur l'Ingrédient
    public Ingredient getIngredient(){
        return ingredient;
    }

    public void remplir(){
        niveau = capacite;
    }
    

    public boolean recuperer(double quantite) throws RecuperationIngredientException{
        if (Math.random()<0.001){
            throw new RecuperationIngredientException("defaillance systeme");
        }
        if(niveau >= quantite){
            niveau -= quantite;
            return true;
        }
        else{
            // condition non vérifiée
            throw new RecuperationIngredientException("niveau insuffisant : " + niveau + "," + ingredient);
        }
    }
}
