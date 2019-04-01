public class TestTableau{
    public static void main(String [] args){
        TableauInt t1 = new TableauInt();
        TableauInt t2 = new TableauInt(5);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println("Le rang max de t1 est : " + t1.rangMax());
        System.out.println("Le rang max de t2 est : " + t2.rangMax());
        System.out.println("La somme des éléments de t1 est : " + t1.Somme());
        System.out.println("La somme des éléments de t2 est : " + t2.Somme());
    }
}