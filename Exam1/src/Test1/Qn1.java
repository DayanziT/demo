package Test1;
import java.util.Scanner;
public class Qn1 {

	public static void main(String[] args) {
		
		
	    int num1, num2, result;

	    Scanner sc = new Scanner(System.in);

	    
	    System.out.println("Enter 1 for Sum,2 for Subtraction,3 for Multiply, 4 for Division");
	    int mathematicalOp = sc.nextInt();

	
	    System.out.println("Enter first number");
	    num1 = sc.nextInt();

	    System.out.println("Enter second number");
	    num2 = sc.nextInt();

	    sc.close();
	    
	    switch (mathematicalOp) {

	      // Addition
	      case 1:
	        result = num1 + num2;
	        System.out.println(num1 + " + " + num2 + " = " + result);
	        break;

	      // performs subtraction between numbers
	      case 2:
	        result = num1 - num2;
	        System.out.println(num1 + " - " + num2 + " = " + result);
	        break;

	      // performs multiplication between numbers
	      case 3:
	        result = num1 * num2;
	        System.out.println(num1 + " * " + num2 + " = " + result);
	        break;

	      // performs division between numbers
	      case 4:
	        result = num1 / num2;
	        System.out.println(num1 + " / " + num2 + " = " + result);
	        break;
	}
	}}
