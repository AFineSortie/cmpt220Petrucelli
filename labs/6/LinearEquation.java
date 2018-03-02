
public class LinearEquation {
	private double a = 0;
	private double b = 0;
	private double c = 0;
	private double d = 0;
	private double e = 0;
	private double f = 0;
	
	public LinearEquation() {
		
	}
	
	public LinearEquation(double a, double b, double c, double d, double e, double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public double getD() {
		return d;
	}

	public double getE() {
		return e;
	}

	public double getF() {
		return f;
	}
	
	public Boolean isSolvable() {
		if ((a * d) - (b * c) != 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public double getX() {
		double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
		return x;
	}
	
	public double getY() {
		double y = ((a * f) - (e * c)) / ((a * d) - (b * c));
		return y;
	}

}
