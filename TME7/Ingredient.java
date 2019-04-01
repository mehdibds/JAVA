public abstract class Ingredient{
    protected String nom;

    public Ingredient(String nom){
        this.nom = nom;
    }
    
    public String toString(){
        return nom;
    }
    
    public boolean equals(Ingredient i1){
        return nom != null && i1.nom != null && nom.equals(i1.nom);
    
    }
}