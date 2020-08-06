package algorithmicPractice;
import java.util.*;

public class EvenFib {
	
	/*
	 * The point of this code is to let people input a numeric value, n, and to sum up the even numbers in the
	 * fibonacci sequence in which the highest value is less than n.
	 */

	
	
	public static void main(String[]args) {
		Scanner LanceAbuan = new Scanner(System.in);
		FibonnaciCalculator FC = new FibonnaciCalculator();
		
		System.out.println("Hello. I am the Even Fibonnaci Sum finder.");
		System.out.println("Give me a numeric value and I will find the sum of all even fibonnaci numbers\nthat are lower than the value you input.");
		int upperBound = LanceAbuan.nextInt();
		
		int previousNumber = 1;
		int nextNumber = 1;
		int placeHolder = 0;
		int evenSum = 0;
		
		while (nextNumber<=upperBound){
			placeHolder = nextNumber;
			nextNumber = FC.FibCalc(previousNumber, nextNumber);
			if(nextNumber%2==0){
				evenSum+=nextNumber;
			}
			previousNumber = placeHolder;		
		}
		System.out.println("The sum of all even fibonnaci numbers below the value "+upperBound+" is: "+evenSum);
		
		
		
		
	}
	
	
	
	
	
	
	
}
