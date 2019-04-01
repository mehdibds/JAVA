public class SystemeSolaire{
    
    private Etoile etoile;
    private Orbite[]tabOrbites;
    private final int MAX_PLANETES = 15;
    private int cpt;
    private int angle_min = 360;


    public SystemeSolaire(Etoile etoile){
        this.etoile = etoile;
        tabOrbites = new Orbite[MAX_PLANETES];
    }

    public void addPlanete(Planete planete){
        tabOrbites[planete.getRang()] = new Orbite(planete);
    }

    public void step(){
        for(int i=0;i<tabOrbites.length;i++){
            if (tabOrbites[i] != null){
                tabOrbites[i].step();
            }
        }
        cpt++;
    }

    public int getNbSteps(){
        return cpt;
    }


    public String findMinDistance(int OrbiteI,int OrbiteJ,int nbSteps,double alpha){
        String string = "";
        string+= "Recherche de proximité entre " + tabOrbites[OrbiteI].getPlanete() + " et " + tabOrbites[OrbiteJ].getPlanete() + ". Etat initial du système :\n";
        
        for(int i=0;i<tabOrbites.length;i++){
            if (tabOrbites[i]!= null){
                string +=(tabOrbites[i]) + "\n";
            }
        }
        string += "Itérations intéressantes" + "\n";
        
        for(int i=1;i<=nbSteps;i++){
            if (tabOrbites[OrbiteI].getDistanceAngulaire(tabOrbites[OrbiteJ])<angle_min && tabOrbites[OrbiteI].getDistanceAngulaire(tabOrbites[OrbiteJ])>= alpha){
                angle_min = tabOrbites[OrbiteI].getDistanceAngulaire(tabOrbites[OrbiteJ]);
                string +=("Itération " + i + ": angle de " + angle_min + " degrés") + "\n";
            }
            step();
        }
        return string;
    }


    public String toString(){
        String string = "";
        string += "Itération " + getNbSteps() + "-- " + etoile + "\n";
        for(int i=0;i<tabOrbites.length;i++){
            if (tabOrbites[i] != null){
                string += tabOrbites[i] + "\n";
            }
            else{
                continue;
            }
        }
    return string;
    }







}



