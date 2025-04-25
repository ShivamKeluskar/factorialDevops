
public class Factorial {

	    // Iterative approach
	    public static long iterativeFactorial(int n) {
	        long result = 1;
	        for (int i = 1; i <= n; i++) {
	            result *= i;
	        }
	        return result;
	    }

	    // Recursive approach
	    public static long recursiveFactorial(int n) {
	        if (n == 0) {
	            return 1;
	        } else {
	            return n * recursiveFactorial(n - 1);
	        }
	    }

	    public static void main(String[] args) {
	        int number = 5;
	        System.out.println("Factorial of " + number + " (iterative): " + iterativeFactorial(number));
	        System.out.println("Factorial of " + number + " (recursive): " + recursiveFactorial(number));
	    }

}
