package basics;

public class TaskOne {

	public static void main(String[] args) {
		/*A function that displays number
		 *from 200 to 250 and displays those divisible by 4.
		 */
		//Generate the numbers
		//check the modulus 4 if true
		//if so display the number
		
		for(int i=200;i<251;i++) {
			
			if (i%4==0) {
				
				
				System.out.print(i);
				System.out.print(",");
				
			}
		}
		

	}

}
