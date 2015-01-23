
public class TestShape {

	public static void main(String[] args) {
	 Shape s1 = new Shape();
	 System.out.println("Color "+ s1.getColor()
			 +" filled "+ s1.isFilled());
	 
	 Shape s2 = new Shape("red", false);
	 System.out.println("Color "+ s2.getColor()
			 +" Filled " + s2.isFilled());
	 System.out.println(s1.toString());
	 
	 Cyrcle c1 = new Cyrcle();
	 System.out.println("Area " + c1.getArea()
			 + " Perimeter " + c1.getPerimeter()
			 + " radius  " + c1.getRadius()
			 + c1.toString());
	 
	 Square sq1 = new Square(2.0,"blue", false);
	 System.out.println("----------------");
	 System.out.println("Square: ");
	 System.out.print(sq1.toString());
	 System.out.println(" Area: "+ sq1.getArea() + " Perimeter: "+ sq1.getPerimeter());
	 
	}

}
