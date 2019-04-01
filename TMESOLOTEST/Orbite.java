public class Orbite{

    private boolean[] position;
    private Planete p;
    public Orbite(Planete p){
        this.p = p;
        position = new boolean[7* p.getRang()];
        int random = (int)(Math.random()*7*p.getRang());
        position[random] = true;
    }


    public int getPosition(){
        for(int i =0;i<position.length;i++){
            if (position[i] == true){
                return i;
            }
        }
        return -1;
    }


    public double getVitesse(){
        return 2.8/Math.sqrt(p.getRang());
    }


    public void step(){
        int deplacement = getPosition() + (int)Math.round(getVitesse());
        if (deplacement >= position.length){
            deplacement -= position.length;
        }
        // System.out.println(deplacement);
        // System.out.println(getPosition());
        // System.out.println((int)Math.round(getVitesse()));
        position[getPosition()] = false;
        position[deplacement] = true;
    }

    public Planete getPlanete(){
        return p;
    }


    public int getPositionAngulaire(){
        return (int)(getPosition() *360/ position.length);
    }


    public int getDistanceAngulaire(Orbite orbiteB){
        if(getPositionAngulaire() - orbiteB.getPositionAngulaire() <= 180){
            return (int)(getPositionAngulaire() - orbiteB.getPositionAngulaire());
        }
        return (int)360 - (getPositionAngulaire() - orbiteB.getPositionAngulaire());
    } 



    public String toString(){
        String string = "";
        for(int i=0;i<position.length;i++){
            if (position[i] == false){
                string += ".";
            }
            else if(position[i] && p.hasAnneaux()){
                string += "O";
            }
            else if (position[i] && !p.hasAnneaux()){
                string += "o";
            }
        }
        string += " planete : " + p + " v = " + getVitesse();
        return string;
    }
}
