public class TestMachineaCafe{
    
    public static void main(String [] args){
        Ingredient []ingredients = {new Cafe(),new Lait()};
        
        double [] quantites = {1.0,2.0};
        
        Recette r = new Recette(ingredients,quantites,1.50,"cafe au lait");

        Machine m = new Machine();
        m.ajouterRecette(r);

        Reservoir reservoir1 = new Reservoir(new Cafe(), 20.0);
        Reservoir reservoir2 = new Reservoir(new Lait(), 20.0);

        m.ajouterReservoir(reservoir1);
        m.ajouterReservoir(reservoir2);

        boolean check = m.checkup();
        System.out.println("Recettes réalisables ? : " + check);

        if(m.getCredit() < r.getPrix()){
            System.out.println("Credit insuffisant pour la recette sélectionnée");
        }
        else{
            System.out.println("Credit suffisant pour la recette sélectionnée");
        }
        while (m.getCredit() > 0){
            m.commander(0);
        }
    }

}