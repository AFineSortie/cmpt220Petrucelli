
public class MyIntegerTest {

	public static void main(String[] args) {
		MyInteger a = new MyInteger(10);
		MyInteger b = new MyInteger(8);
		char[] testChar = {'1', '2', '3', '4'};
		
		System.out.println("The value in MyInteger a is: " + a.getValue());
		System.out.println("The value in MyInteger b is: " + b.getValue());

		System.out.println("\n3 is even: " + MyInteger.isEven(3));
		System.out.println("3 is odd: " + MyInteger.isOdd(3));
		System.out.println("3 is prime: " + MyInteger.isPrime(3));
		
		System.out.println("\nThe value in MyInteger a is even: " + a.isEven());
		System.out.println("The value in MyInteger a is odd: " + a.isOdd());
		System.out.println("The value in MyInteger a is prime: " + a.isPrime());
		
		System.out.println("\nThe value in MyInteger b is even: " + MyInteger.isEven(b));
		System.out.println("The value in MyInteger b is odd: " + MyInteger.isOdd(b));
		System.out.println("The value in MyInteger b is prime: " + MyInteger.isPrime(b));
		
		System.out.println("\nThe value 10 is equal to the value in MyInteger a: " + a.equals(10));
		System.out.println("The value in MyInteger a is equal to the value in MyInteger b: " + a.equals(b));
		
		System.out.println("\n" + MyInteger.parseInt(testChar));
		System.out.println(MyInteger.parseInt("1234"));
	}

}
