public class TestPartie4{

    public static void main(String[] args){
        Etoile soleil = new Etoile("Soleil",5777,1);
        PlaneteTellurique mercure = new PlaneteTellurique("Mercure");
        PlaneteTellurique venus = new PlaneteTellurique("venus");
        PlaneteTellurique terre = new PlaneteTellurique("Terre");
        PlaneteTellurique mars = new PlaneteTellurique("Mars");
        PlaneteGazeuse jupiter = new PlaneteGazeuse("Jupiter");
        PlaneteGazeuse saturne = new PlaneteGazeuse("Saturne");
        PlaneteGazeuse uranus = new PlaneteGazeuse("Uranus");
        PlaneteGazeuse neptune = new PlaneteGazeuse("Neptune");
        
        SystemeSolaire ss = new SystemeSolaire(soleil);
        ss.addPlanete(mercure);
        ss.addPlanete(venus);
        ss.addPlanete(terre);
        ss.addPlanete(mars);
        ss.addPlanete(jupiter);
        ss.addPlanete(saturne);
        ss.addPlanete(uranus);
        ss.addPlanete(neptune);

        for(int i=1;i<=3;i++){
            ss.step();
            System.out.println(ss);
        }
    
        System.out.println(ss.findMinDistance(4, 3, 500, 3));
    
    }



}