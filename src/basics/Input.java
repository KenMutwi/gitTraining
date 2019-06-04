package basics;

import java.util.Scanner;

public class Input {
	int number;

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a number");
		
		double num = scan.nextDouble();
		System.out.println(num*2 );

	}

}
