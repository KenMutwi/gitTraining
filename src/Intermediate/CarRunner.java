package Intermediate;

public class CarRunner {

	public static void main(String[] args) {
		Car gari = new Car("Honda","fit",1300,"green","saloon");
		System.out.println("gari: "+ gari.getMake());
		
		Car gari_uno = new Car();
		gari_uno.setMake("Toyota");
		System.out.println("gari_uno: "+ gari_uno.getMake());

	}

}
