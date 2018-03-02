
public class Rectangle {
	double width = 1;
	double height = 1;
	
	Rectangle() {
		
	}
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		double area = this.width * this.height;
		return area;
	}
	
	public double getPerimeter() {
		double perim = (this.width * 2) + (this.height * 2);
		return perim;
	}
	
}
