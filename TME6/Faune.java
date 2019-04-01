public class Faune{
    private static final int TAILLE = 20;
    private Animal[] tab;

    public Faune(int nbanimals){
        tab = new Animal[nbanimals];

        for(int i = 0;i<nbanimals;i++){
            int x = (int)(Math.random() * TAILLE);
            int y = (int)(Math.random() * TAILLE);

            if(i % 3 == 0){
                tab[i] = new Poule(x, y);
            }
            else if(i % 3 == 1){
                tab[i] = new Renard(x, y);
            }
            else{
                tab[i] = new Vipere(x, y);
            }
        }
    }

    public String terrain(){
        String string = "";
        for(int y = 0;y<TAILLE;y++){
            for (int x = 0;x<TAILLE;x++){
                boolean animalPresent = false;
                for(int i = 0;i<tab.length; i++){
                    if (tab[i] != null && tab[i].getX() == x && tab[i].getY() == y){
                        string+= tab[i];
                        animalPresent = true;
                        break;
                    }
                }
                if (!animalPresent){
                        string+= " . ";
                }    
            
            }
            string+= "\n";
        }
        return string;
    }


    public int getIndiceAnimalLePlusProche(Animal requete){
        double dist_min=Double.POSITIVE_INFINITY;
        int index = -1;
        for(int i = 0;i<tab.length;i++){
            if (tab[i] == requete){
                continue;
            }
            if (tab[i] == null){
                continue;
            }
            if (tab[i].distance(requete) < dist_min){
                index = i;
                dist_min = tab[i].distance(requete);
            }
        }
        return index;
    }

    public void etatDeLaFaune(){
        for (int i = 0;i<tab.length;i++){
            if (tab[i] != null ){
                System.out.println("L'animal le plus proche de " + tab[i] + " est : " + tab[getIndiceAnimalLePlusProche(tab[i])]);
            }
        }
    }

    public Animal[] getTab(){
        return tab;
    }

    public void update(){
        // RAPPEL : Les poules mangent des vipères, les vipères des renards et les renards des poules...
        for (int i=0;i<tab.length;i++){
            if (tab[i]!= null){
            Animal proche = tab[getIndiceAnimalLePlusProche(tab[i])];
            tab[i].move(proche);
            System.out.println("L'animal : " + tab[i] + " à bougé à la case : (" + tab[i].getX() + "," + tab[i].getY() + ")");
            }
        }
        for (int animal=0;animal<tab.length;animal++){
            for (int animalcomp=animal + 1;animalcomp<tab.length;animalcomp++){
                if (tab[animal] != null && tab[animalcomp] != null){
                    if (tab[animal].getX() == tab[animalcomp].getX() && tab[animal].getY() == tab[animalcomp].getY()){
                        if((tab[animal].getType() == "poule" && tab[animalcomp].getType() == "vipere")){
                            System.out.println("Une vipere a été mangée !");
                            tab[animalcomp] = null;
                        }
                        else if((tab[animal].getType().equals("poule") && tab[animalcomp].getType().equals("renard"))){
                            System.out.println("Une poule a été mangée!");
                            tab[animal] = null;
                        }
                        else if((tab[animal].getType().equals("renard") && tab[animalcomp].getType().equals("poule"))){
                            System.out.println("Une poule a été mangée !");
                            tab[animalcomp] = null;
                        }
                        else if((tab[animal].getType().equals("renard") && tab[animalcomp].getType().equals("vipere"))){
                            System.out.println("Un renard a été mangé!");
                            tab[animal] = null;
                        }
                        else if((tab[animal].getType().equals("vipere") && tab[animalcomp].getType().equals("poule"))){
                            System.out.println("Une vipere a été mangée !");
                            tab[animal] = null;
                        }
                        else if((tab[animal].getType().equals("vipere") && tab[animalcomp].getType().equals("renard"))){
                            System.out.println("Un renard a été mangée!");
                            tab[animalcomp] = null;
                        }
                    }
                }
            }
        }
    }    
}
