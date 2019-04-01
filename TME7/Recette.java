public class Recette{
    private Ingredient[] ingredients;
    private double[] quantites;
    private double prix;
    private String nom;

    public Recette(Ingredient[] ingredients,double[] quantites,double prix,String nom){
        this.ingredients = ingredients;
        this.quantites = quantites;
        this.prix = prix;
        this.nom = nom;
    }
    
    public Ingredient[] getIngredients(){
        return ingredients;
    }
    public double[] getQuantites(){
        return quantites;
    }
    public double getPrix(){
        return prix;
    }
    public String getNom(){
        return nom;
    }

}