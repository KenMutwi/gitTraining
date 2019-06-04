package basics;

public class ConditionalElseIf {

	public static void main(String[] args) {
		int x = 45;
		int y = 89;
		
		if (x<y) {
			System.out.print("Y is bigger");
		}
		else if(x>y) {
			System.out.print("x is bigger");
		}
		else {
			System.out.print("Y is equal to x");
		}
		
	}

}
