package algorithmicPractice;
import java.util.*;

public class MultiplesCalculator {
	
	public static void multSum(int subject, int num1, int num2) {
		int sum=0;
		for(int i = 0;i<subject;i++) {
			
			if(i%num1 == 0 | i%num2 == 0) {
				sum+=i;
			}
			
		}
		
		System.out.println("The sum of all the numbers between 0 and "+subject+" that are divisible by "+num1+" or "+num2+" is: ");
		System.out.println(sum);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner LanceAbuan = new Scanner(System.in);

		System.out.println("Give me a numeric value that you would like to sum the multiples of.");
		int subject = LanceAbuan.nextInt();
		
		
		System.out.println("Input 2 numbers to find a sum of all of the numbers that contain at least one of them as a multiple. ");
		
		
		System.out.println("Input number 1: ");
		int num1 = LanceAbuan.nextInt();
		System.out.println("Input number 2: ");
		int num2 = LanceAbuan.nextInt();
		
		multSum(subject,num1,num2);
		
		
		
		
	}

}
