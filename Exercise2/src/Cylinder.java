
public class Cylinder extends Circle {

	private double height;
	
	public double getHeight() {
		return height;
	}
		
	public Cylinder () {
		super();
		this.height = 1.0;	
	
	}
	public Cylinder (double height) {
		super();
		this.height = height;	
	
	}
	public Cylinder (double radius, double height) {
		super(radius);
		this.height = height;	
	}
	
	
	 public double getVolume() {
	      return super.getArea()*height; 
	 }
	 @Override
	 public double getArea(){
	 
	 return 2*Math.PI*getRadius()*height + 2*radius*radius*Math.PI;
 }

    @Override
    public String toString() {
	
	return "Cylinder: subclass of "+ super.toString()
			+ "height = " + height ;
}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

