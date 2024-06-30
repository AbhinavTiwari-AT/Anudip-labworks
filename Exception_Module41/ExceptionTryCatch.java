
//Java program that throws an exception and catch it using a try-catch block.

package Exception_module41;
public class ExceptionTryCatch {

	public static void main(String[] args) {
		try {
	
			int result = divideNumbers(10, 0);
			System.out.println("Result of division: " + result);
		} catch (ArithmeticException e) {
			
			System.out.println("Exception caught: " + e.getMessage());
		}
	}

	
	public static int divideNumbers(int dividend, int divisor) {
		if (divisor == 0) {

			throw new ArithmeticException("Division by zero is not allowed.");
		}
		return dividend / divisor;
	}
}