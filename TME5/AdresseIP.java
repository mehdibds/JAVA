public class AdresseIP{
    private static int[] tab = {192,168,0,0};

    public static String getAdresseIP(){
        if(tab[3] == 255){
            tab[2] ++;
            tab[3] = 0;
        }
        else{
            tab[3]++;
        }
        return tab[0] + "." + tab[1] + "." + tab[2] + "." + tab[3];
    }

    public static void main(String [] args){
        for (int i=0;i<500;i++){
            System.out.println(AdresseIP.getAdresseIP());
        }
    }
}