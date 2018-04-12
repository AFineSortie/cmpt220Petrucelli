
public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {
	private double side = 0;
	
	public Octagon() {
		
	}
	
	public Octagon(double side) {
		this.side = side;
	}
	
	public double getSide() {
		return side;
	}
	
	public void setSide(double side) {
		this.side = side;
	}
	
	public double getArea() {
		return (2 + 4 / Math.sqrt(2)) * side * side;
	}
	
	public double getPerimeter() {
		return 8 * side;
	}
	
	@Override
	public int compareTo(Octagon o) {
		if (getArea() > o.getArea()) {
			return 1;
		} else if (getArea() < o.getArea()) {
			return -1;
		} else {
			return 0;
		}
	}
	
	@Override
	public Object clone() {
		try {
			return super.clone();
		}
		catch (CloneNotSupportedException ex) {
			return null;
		}
	}
}
