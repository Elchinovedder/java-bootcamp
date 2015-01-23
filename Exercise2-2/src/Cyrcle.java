
public class Cyrcle extends Shape {
   public double radius;
   
   public Cyrcle (){
	   radius = 1.0;
	      
   }
   public  Cyrcle (double r){
	this.radius = r;   
   }
   
   public  Cyrcle (double r, String color, Boolean filled){
	   super(color, filled);
		this.radius = r;   
	   }
   
   public double getRadius() {
	  return radius;
}

   public void setRadius(double radius) {
	  this.radius = radius;
}

  public double getArea(){ 
	  return radius*radius*Math.PI;
	  
  }
  
  public  double getPerimeter (){
	   return 2*radius*Math.PI;  
	  
	  
  }


@Override
public String toString() {
	
	return " A Circle with radius" + radius + "wich is a subclass of "+ super.toString();
}

}
