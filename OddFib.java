package algorithmicPractice;

import java.util.Scanner;

public class OddFib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner LanceAbuan = new Scanner(System.in);
		FibonnaciCalculator FC = new FibonnaciCalculator();
		
		System.out.println("Hello. I am the Odd Fibonnaci Sum finder.");
		System.out.println("Give me a numeric value and I will find the sum of all odd fibonnaci numbers\nthat are less than or equal to the value you input.");
		int upperBound = LanceAbuan.nextInt();
		
		int previousNumber = 1;
		int nextNumber = 1;
		int placeHolder = 0;
		int oddSum = 2;
		
		while (nextNumber<=upperBound){
			placeHolder = nextNumber;
			nextNumber = FC.FibCalc(previousNumber, nextNumber);
			if(nextNumber%2!=0 && nextNumber<=upperBound){
				System.out.println(nextNumber);
				oddSum+=nextNumber;
			}
			previousNumber = placeHolder;		
		}
		
		//The plus 1 at the end of this print statement is to account for the fact that the first 1 isn't added
		System.out.println("The sum of all even fibonnaci numbers below the value "+upperBound+" is: "+(oddSum));
		
	}

}
