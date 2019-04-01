public class TestVillageois {
	public static void main(String [] args) {
		Villageois v1 = new Villageois("v1");
		Villageois v2 = new Villageois("v2");
		Villageois v3 = new Villageois("v3");
		Villageois v4 = new Villageois("v4");
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		
		double total = v1.poidsSouleve() + v2.poidsSouleve() + v3.poidsSouleve() + v4.poidsSouleve();
		if(total<100) {
			System.out.println("Les villageois ne peuvent pas soulever le rocher.");
		} else {
			System.out.println("Les villageois peuvent soulever le rocher.");

		}
	}
}
