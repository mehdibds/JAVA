public class TestHisto{
    public static void main(String [] args){
        int [] tabEtu = new int[150];
        for(int i=0;i<tabEtu.length;i++){
            tabEtu[i] = (int)(Math.random()*21);
        }
        Histo histo = new Histo(tabEtu);
        histo.afficheHistogrammeTableau();
        histo.afficheHistogramme();
    }
}