package simple;
/**
 * This class holds simple recursive methods. 
 * @author raunak
 */
/* with some simple recursive math functions */
public class RecursiveMath {

		/**
		 * computes the sum of 1 through n recursively
		 * @param n 
		 * @return the summation of 1 through n
		 */
		public int recursiveSum(int n){
			if (n == 1)
				return 1;
			else
				return n + recursiveSum (n-1);
		}
	
		/**
		 * Given two integers, x and y, computes the value of x raised to the power y
		 * @param <code> x </code> the base value
		 * @param <code> y </code> the power value
		 * @return the value of <code> x </code> raised to the power <code> y </code>
		 */
		public int recursivePower(int x, int y){
			
				return 0;
			
		}
	
		/**
		 * Recursively compute the greatest common divisor of two numbers
		 * @param x the first integer
		 * @param y the second integer
		 * @return the greatest common divisor of x and y
		 * Algorithm: if (y==0) return x else return gcd(y,x%y)
		 */
		public int recursiveGCD(int x, int y){

			return 0;
			
		}
	
	
}
