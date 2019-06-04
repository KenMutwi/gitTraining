package basics;

import java.util.Scanner;

public class TaskTwo {

	public static void main(String[] args) {
		// accepts input between 0 to 100
		//checks if its prime number or not
		while(true) {
		int num =10001;
		
		while(num<0 || num>100) {
			
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter a number betwwen 0 to 100");
			
			 num = scan.nextInt();
		
		}
			
			if (num ==0 || num==1 ) {
				
			System.out.println("That is NOT a prime number");
				
			}else if(num%2==0||num % 3==0 || num%5==0 || num % 7==0) {
				
				System.out.println("That number is NOT a prime number");
			
			} else {
				System.out.println("That number is a prime number");
			}
		

	}
	}

}
