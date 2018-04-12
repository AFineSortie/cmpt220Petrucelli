
public class OctagonTest {

	public static void main(String[] args) {
		Octagon n = new Octagon(5);
		System.out.println("Area of Octagon n: " + n.getArea());
		System.out.println("Perimeter of Octagon n: " + n.getPerimeter());
		Octagon nClone = (Octagon)n.clone();
		int comparison = n.compareTo(nClone);
		if (comparison == 1) {
			System.out.println("Octagon n is greater than octagon nClone");
		} else if (comparison == -1) {
			System.out.println("Octagon n is less than octagon nClone");
		} else if (comparison == 0) {
			System.out.println("Octagon n and octagon nClone are equal");
		}
	}

}
