package Intermediate;

import java.util.Scanner;

public class Methods {

	public static void main(String[] args) {
		Methods me=new Methods();
		//Scanner inputOne= new Scanner(System.in);
		//System.out.println("Enter the first number");
		//int v= inputOne.nextInt();
		
		//Scanner inputTwo= new Scanner(System.in);
		//System.out.println("Enter the second number");
		//int w= inputTwo.nextInt();
		
		//int res= me.;
		
		System.out.println(me.calc(45, 89,78));

	}
	public int calc(int x,int y){
		
		int sum = x+y;
		
		return sum;
	}
public int calc(int x,int y,int z){
		
		int sum = x+y+z;
		
		return sum;
	}
public int calc(int x,int y,int z,int w){
	
	int sum = x+y+z+w;
	
	return sum;
}
public double calc(double x,double y){
	
	double sum = x+y;
	
	return sum;
}

}
