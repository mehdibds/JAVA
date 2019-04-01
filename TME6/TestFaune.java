public class TestFaune{
  public static void main(String[] args){
    Faune f = new Faune(21); // 
    System.out.println(f.terrain()); // aff. terrain
    
    Animal[] tab = f.getTab(); // a ajouter pour les tests
    for(Animal a: tab){
      Animal plusProche = tab[f.getIndiceAnimalLePlusProche(a)];
      System.out.println(a + " a pour voisin le plus proche : " + plusProche);
    }
    System.out.println("On fait bouger tout les animaux vivants du tableau ! : ");
    f.update();
    System.out.println(f.terrain());
    
  }
}