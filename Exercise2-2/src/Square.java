
public class Square  extends Rectangle {
	
	private Double side;
	
	public Square() {
		   super();
}
	
	public Square(double side) {
		   super(side, side);  

}

	
	public Square(Double side, String color, Boolean filled){
		super(side, side, color, filled);
	}

	@Override
	public String toString() {
		
		return " A Square with width " + width + " and length "+ lenght +" wich is a subclass of " + super.toString();
	}  

	public Double getSide() {
		return side;
	}

	public void setSide(Double side) {
		this.side = side;
	}
	@Override
	public double getArea (){
		System.out.print("This is an overriden method");
		return width*width ;
	}
	@Override  
	public double getPerimeter(){
		System.out.print("This is an overriden method");
		return 4*width ;
	}
}

