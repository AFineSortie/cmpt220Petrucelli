
public class Circle2D {
	public double x;
	public double y;
	public double radius;
	
	public Circle2D() {
		this.x = 0;
		this.y = 0;
		this.radius = 1;
	}
	
	public Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double getArea() {
		return Math.PI * (radius * radius);
	}
	
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	
	public Boolean contains(double x, double y) {
		return ((x - this.getX()) * (x - this.getX())) + ((y - this.getY()) * (y - this.getY())) < radius * radius;
	}
	
	public Boolean contains(Circle2D circle) {
		double distance = Math.sqrt((this.getX() - circle.getX()) * (this.getX() - circle.getX()) + (this.getY() - circle.getY()) * (this.getY() - circle.getY()));
		return distance <= this.radius - circle.radius;
	}
	
	public Boolean overlaps(Circle2D circle) {
		double distance = Math.sqrt((this.getX() - circle.getX()) * (this.getX() - circle.getX()) + (this.getY() - circle.getY()) * (this.getY() - circle.getY()));
		if (!(distance > this.radius + circle.radius) && !(this.contains(circle))) {
			return true;
		} else {
			return false;
		}
	}
}
