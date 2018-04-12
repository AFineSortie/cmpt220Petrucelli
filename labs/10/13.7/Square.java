
public class Square extends GeometricObject implements Colorable {
	private double side = 0;
	public Square() {

	}
	
	public Square(double side) {
		this.side = side;
	}
	
	public double getSide() {
		return side;
	}
	
	public void setSide(double newSide) {
		this.side = newSide;
	}
	
	public void howToColor() {
		System.out.print("Color all four sides.");
	}
	
	public double getArea() {
		return side * side;
	}
	
	public double getPerimeter() {
		return side + side + side + side;
	}
}
