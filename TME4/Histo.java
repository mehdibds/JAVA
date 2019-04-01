import java.text.BreakIterator;
import java.util.ArrayList;

public class Histo{

    private int[]hist =  new int[21];

    public Histo(){
        for(int i = 0;i<hist.length;i++){
            hist[i] = 0;
        }
    }

    public Histo(int[]tab){
        for(int i=0;i<tab.length;i++){
            ajoutNote(tab[i]);
        }
    }

    public void ajoutNote(int note){
        if (note<0 || note > 20){
            System.out.println("La note est non valide");
        }
        else{
            hist[note]+= 1;
        }
    }

    public void afficheHistogrammeTableau(){
        for(int i=0;i<hist.length;i++){
            System.out.println("Valeur " + i + " de l'histogramme : " + hist[i]);
        }
    }

    public void afficheHistogramme(){
        for(int i = 0;i<hist.length;i++){
            System.out.print(i + " | ");
            for(int j=0; j<hist[i];j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


