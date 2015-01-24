
 public class Main {
	
public static void main (String [] args ) {
	
	HouseDirector director = new HouseDirector ();
	director.setHouseBuilder(new StandardHouse());
	director.builderHouse();
    House house = director.getHouse();

    System.out.println(house.toString());
	
    director.setHouseBuilder(new LuxuryHouse());
    director.builderHouse();
	House houseLuxury = director.getHouse();
	System.out.println(houseLuxury.toString());
 }
}