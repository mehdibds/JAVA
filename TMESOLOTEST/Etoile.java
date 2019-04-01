public class Etoile{
    private String nom;
    private int temperature;
    private int masse;

    public Etoile(String nom,int temperature,int masse){
        this.nom = nom;
        this.temperature = temperature;
        this.masse = masse;
    }

    public String getNom(){
        return nom;
    }
    public int getTemp(){
        return temperature;
    }
    public int getMasse(){
        return masse;

    }

    public String toString(){
        return nom + " [T = " + temperature + " K  M = " + masse + "]";
    }
}