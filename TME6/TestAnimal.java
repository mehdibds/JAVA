public class TestAnimal{
    
    public static void main(String [] args){
        Poule a1 = new Poule(5,5);
        Renard a2 = new Renard(10,10);
        Vipere a3 = new Vipere(15,15);
        a1.afficher();
        a2.move(4,4);
        a2.afficher();
        a3.afficher();
    }  
}