package basics;

public class Switch {

	public static void main(String[] args) {
		int x = 56;
		
		switch (x) {
		case 40:
			System.out.print("x is 40");
			
			break;
		case 56:
		case 50:
			System.out.print("x=50");
			break;
		case 60:
			System.out.print("x is 60");
			break;

		default:
			System.out.print("not");
			break;
		}

	}

}
