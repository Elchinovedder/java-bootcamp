
public class Rectangle extends Shape {
  public double width;
  public double lenght;
  
  public Rectangle (){
	  width = 1.0;
	  lenght = 1.0;
	  	  
  }

public Rectangle(double w, double l) {
	width = w;
	lenght = l;	
}

public Rectangle(double w, double l, String color, Boolean filled) {
	super(color, filled);
	width = w;
	lenght = l;	
}


public double getWidth() {
	return width;
}

public void setWidth(double width) {
	this.width = width;
}

public double getLenght() {
	return lenght;
}

public void setLenght(double lenght) {
	this.lenght = lenght;
	
}
  
public double getArea (){
	return width*lenght ;
}
  
public double getPerimeter(){
	return 2*width + 2*lenght;
}

@Override
public String toString() {
	
	return " A Rectangle with width " + width + " and length "+ lenght +" wich is a subclass of " + super.toString();
}  




}
