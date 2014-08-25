package simple;
/**
 * This is a simple class with some very simple mathematical operations 
 * to illustrate the use of JUnit testing.
 * 
 *  @author Mohammad Raunak
 *  @verion 1.2 08/25/2014
 */
public class SimpleMath {


		int num1, num2;

		/** Default constructor for the class */
		public SimpleMath(){
			// An empty Constructor
		}

		/**
		 * Given two integers, this method returns the addition
		 * @param num1 the first integer
		 * @param num2 the second integer
		 * @return the summation of the two integers
		 */
		public int add(int num1, int num2){
			return num1+num2;
		}

		// Overloaded method of adding two double numbers
		public double add (double num1, double num2){
			return num1+num2;
		}
		
		// subtracts second int from first int
		public int subtract(int num1, int num2){
			return num1 - num2;
		}
		
		/* Computes and returns the sum of integers from 1 through N */
		public int sumN(int n){
			int sum = 0;
		
			return sum;
		}
		
		/* Returns the summation of first N integers using a formula */
		public int sumNFormula(int n){
			
			return n*(n+1)/2;
			
		}

}
