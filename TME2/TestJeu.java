import java.lang.Math;

public class TestJeu{
	public static void main(String [] args){
        Jeu init = new Jeu();
        for(int cpt=0;cpt<1000;cpt++){
            init.melanger(100);
            int rand = (int)Math.random()*3;
            System.out.println(init.choisir(rand));
        }
    }
}
