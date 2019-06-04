package Advanced;

public class CommuterRunner {

	public static void main(String[] args) {
		
		CarInherit car1= new CarInherit();
		car1.setMake("Mercedes Benz");
		car1.setModel("F 30");
		car1.setColor("Black");
		car1.setEngine_cc(2500);
		car1.setBody_type("Saloon");
		
		
		System.out.println(car1.getSpeed());
		
		for (int i=0; i<10; i++) {
			car1.accelerate();
			System.out.print(i);
		}
		System.out.println("");
		System.out.println(car1.getSpeed());
		
		Commuter merc=new CarInherit();
		for(int m=0;m<20;m++) {
			merc.accelerate();
			
			System.out.println("Merc Accelerating: "+merc.getSpeed());
			
		}
	}
	
	

}
