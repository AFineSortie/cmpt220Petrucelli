import java.util.Scanner;
public class Payroll {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter employee's name: ");
		String name = input.next();
		
		System.out.print("Enter number of hours worked in a week: ");
		float hours = input.nextFloat();
		
		System.out.print("Enter hourly pay rate: ");
		float rate = input.nextFloat();
		
		System.out.print("Enter federal tax withholding rate: ");
		float fedRate = input.nextFloat();
		
		System.out.print("Enter state tax withholding rate: ");
		float stateRate = input.nextFloat();
		
		float grossPay = rate * hours;
		
		System.out.println("");
		System.out.println("Employee Name: " + name);
		System.out.println("Hours Worked: " + hours);
		System.out.println("Pay Rate: $" + rate);
		System.out.println("Gross Pay: $" + grossPay);
		System.out.println("Deductions:");
		System.out.println("  Federal Withholding (" + (fedRate * 100) + "%): $" + (fedRate * grossPay ));
		System.out.println("  State Withholding (" + (stateRate * 100) + "%): $" + (stateRate * grossPay));
		System.out.println("  Total Deduction: $" + ((stateRate + fedRate) * grossPay));
		System.out.println("Net Pay: $" + (grossPay - ((stateRate + fedRate) * grossPay)));
	}

}
