public class Alea{
    
    //méthode de classe
    public static char lettre(){
        return (char)(Math.random()*('z' - 'a' + 1)+ 'a');
    
    }

    //méthode de classe
    public static String chaine(){
        String string = "";
        for (int i=0;i<10;i++){
            string+= Alea.lettre();
        }
        return string;
    }

    //Ce sont des méthodes de classe car elles sont statiques (n'ont pas besoin des attributs de la classe)

    /*public static void main(String [] args){
        Alea alea = new Alea();
        String string = alea.chaine();
        System.out.println(string);
    }
    Main ou la méthode de classe chaine est non statique donc on doit créer une instance de la classe et appeler la méthode*/
    public static void main(String [] args){
        System.out.println(Alea.chaine());
    }

}