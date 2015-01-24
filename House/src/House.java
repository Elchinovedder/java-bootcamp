
public class House {
     int floor;
	 int window;
	 int room;
	 int bath;
	 int door ;
	 
	 
	 public House() {
	 floor = 1;
	 window = 4 ;
	 room =  4;
	 bath = 2;
	 door = 5;
	 
	 }
   
	 public void  House (int floor, int window , int room, int bath, int door) {
	 
	 this.floor = floor;
	 this.window= window;
	 this.room=room;
	 this.bath= bath;
	 this.door= door;
	  
	 
	 }

    public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}
   public int getWindow(){
		return window;
	}

	public void setWindow(int window) {
		this.window = window;
	}
    public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}
    public int getBath() {
		return bath;
	}

	public void setBath(int bath) {
		this.bath = bath;
	}
    public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}

    public  String toString (){
	return " This house has floor " + floor + " bedrooms " + room +  " windows " +  window
		+ " bath " + bath + "and doors " + door ; 
	}


}


 abstract class HouseBuilder {
	
	protected House house;
	
	public House getHouse() {
		return house;
	}
	
public void buildHouse () {
	
	house = new House();
	
}
public abstract void buildWindows();

public abstract void buildFloors();

public abstract void buildRooms();

public abstract void buildDoors();

public abstract void buildBath ();

	
	
}

 class StandardHouse extends HouseBuilder{
	
	 @Override
	 public void buildWindows () {
		
		house.setWindow(5);
	}
	 @Override
    public void buildFloors() {
		
		house.setFloor(1);
	}	 
	 @Override
	public void buildRooms () {
		
		house.setRoom (5);
	}
	 @Override
	public void buildBath () {
		
		house.setBath (2);
	}
	 @Override
	public void buildDoors() {
		
		house.setDoor(5);
	}
	 	
}


 class LuxuryHouse extends HouseBuilder{

	 @Override
     public void buildFloors() {
		
		house.setFloor (2);
	}
	 @Override
	public void buildRooms () {
		
		house.setRoom (8);
	}
	 @Override
	public void buildBath () {
		
		house.setBath (4);
		
	}
	 @Override
	public void buildWindows () {
		
		house.setWindow(10);
		
	}
	 @Override
     public void buildDoors () { 
		
		house.setDoor (9);
	}
	
	
	
}


 class HouseDirector {
	
	
	private HouseBuilder housebuilder;
	
	public void builderHouse () {
		
		housebuilder.buildHouse();
		housebuilder.buildFloors();
		housebuilder.buildRooms();
		housebuilder.buildBath();
		housebuilder.buildWindows();
		housebuilder.buildDoors();
				
	}
	
	public void setHouseBuilder ( HouseBuilder hb) {
		
		housebuilder = hb;
		
	}
	
	public House getHouse () {
		
		return housebuilder.getHouse();
	}
}
	
	
	
	
