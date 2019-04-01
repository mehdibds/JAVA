public class Robinet extends Reservoir{

    public Robinet(Ingredient ingredient){
        super(ingredient,Double.POSITIVE_INFINITY);
    }

    public boolean recuperer(double quantite) throws RecuperationIngredientException{
        if(Math.random()<0.002){
            throw new RecuperationIngredientException("Pensez à vérifier que le robinet est ouvert");
        }
        return true;
    }


}