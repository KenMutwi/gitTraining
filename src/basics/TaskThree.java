package basics;

import java.util.Scanner;

public class TaskThree {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your first number");
		int number_one = scan.nextInt();
		
		Scanner scan_one = new Scanner(System.in);
		System.out.println("Enter the second number ");
		int number_two = scan_one.nextInt();
		
		Scanner scan_two = new Scanner(System.in);
		System.out.println("Enter the third number");
		int number_three = scan_one.nextInt();
		
		if (number_one < number_two) {
			
			/*if(number_two< number_three) {
				
				System.out.print(number_three);
				System.out.print(",");
			}else(number_one < number_two); {
				System.out.print(number_two);
				System.out.print(",");
				System.out.print(number_one);
				
			}*/
			
		}if (number_two > number_three) {
			
			if(number_two> number_one) {
				
				System.out.print(number_two);
				System.out.print(",");
			}else if(number_one < number_three) {
				System.out.print(number_two);
				System.out.print(",");
				System.out.print(number_one);
				
			}
			
		}
		

	}

}
