
public class MyInteger {
	public int value = 0;
	
	public MyInteger(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public Boolean isEven() {
		return value % 2 == 0;
	}
	
	public Boolean isOdd() {
		return value % 2 != 0;
	}
	
	public Boolean isPrime() {
		for (int i = 2; i < value; i++) {
			if (value % i == 0) {
				return false;
			}
		} 
		return true;
	}
	
	public static Boolean isEven(int a) {
		return a % 2 == 0;
	}
	
	public static Boolean isOdd(int a) {
		return a % 2 != 0;
	}
	
	public static Boolean isPrime(int a) {
		for (int i = 2; i < a; i++) {
			if (a % i ==0) {
				return false;
			}
		}
		return true;
	}
	
	public static Boolean isEven(MyInteger a) {
		return a.getValue() % 2 == 0;
	}
	
	public static Boolean isOdd(MyInteger a) {
		return a.getValue() % 2 != 0;
	}
	
	public static Boolean isPrime(MyInteger a) {
		for (int i = 2; i < a.getValue(); i++) {
			if (a.getValue() % i ==0) {
				return false;
			}
		}
		return true;
	}
	
	public Boolean equals(int a) {
		return a == value;
	}
	
	public Boolean equals(MyInteger a) {
		return a.getValue() == value;
	}
	
	public static int parseInt(char[] a) {
		int num = Integer.parseInt(new String(a));
		return num;
	}
	
	public static int parseInt(String a) {
		int num = Integer.parseInt(a);
		return num;
	}
}
