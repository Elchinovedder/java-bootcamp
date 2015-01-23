
public class Shape {

	public String color;
	public Boolean filled;
	
	
	public Shape(){
		
		color = "green";
		filled = true;
	}

    public Shape(String c , Boolean b){
    	
    	color = c;
    	filled =  b;
    	
    	
    }
	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public Boolean isFilled() {
		return filled;
	}


	public void setFilled(Boolean filled) {
		this.filled = filled;
	}


	@Override
	public String toString() {
		return "A Shape with color of " + color  +  " filled " +   filled.toString();
	}
	 
	
		
		
		
	}

