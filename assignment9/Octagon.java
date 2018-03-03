package assignment9;

//creates a class to implement the methods of the shape class
public class Octagon implements Shape {
	
	private double side1;
	
//constructor makes an octagon with the first given side
    public Octagon(double side1) {
    	this.side1 = side1;
    	
    }
    // returns the perimeter of an octagon
    public double getPerimeter() {
    	return side1 * 8;
    }
    //returns the area of an octagon
    public double getArea() {
    	//return  (2 + (4 / (Math.sqrt(2))) * side1 * side1); 
    	return (2 + 4 / Math.sqrt(2)) * side1 * side1;
    }
}
