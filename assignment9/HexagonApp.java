package assignment9;

public class HexagonApp implements Shape {
	//creates another class (hexagon) to test the shape class
	private double side2; 
	
	//constructor makes an hexagon with the first given side
    public HexagonApp(double side2) {
    	this.side2 = side2;
    	
    }
    
    public double getPerimeter() {
    	return side2 * 6;
    }

	public double getArea() {
		
		return  (((3*Math.sqrt(3))/2)*side2*side2);
		
	}
}
