public class ReservoirConnecte{
    private Ingredient ingredient;
    private double capacite;
    private String adresse;


    public ReservoirConnecte(Ingredient ingredient,double capacite,String adresse){
        this.ingredient = ingredient;
        this.capacite = capacite;
        this.adresse = adresse;
    }

    public void MailTo(){
        // fonction pour envoyer un mail avec une extension
        System.out.println("Envoyer un message à : " + adresse);
    }

    public double getCapacite(){
        return capacite;
    }

    public Ingredient getIngredient(){
        return ingredient;
    }

    public String adresse(){
        return adresse;
    }





}