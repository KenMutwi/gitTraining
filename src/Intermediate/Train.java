package Intermediate;

public class Train {
	

	private String make;
	private  String model;
	private int speed;
	private String color;
	private String energy_type;
	private int accelerate;
	private int brake;



	Train(){
		
	}
	
	Train(String ma,String mo,int cc,String colo,String bo){
		
		make=(ma);model=mo;color=colo;bo=energy_type;speed=0;
	}
	public void accelerate(int s) {
		this.speed =s;
		
	}
	public void brake() {
		speed--;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSpeed() {
		return speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getEnergy_type() {
		return energy_type;
	}

	public void setEnergy_type(String energy_type) {
		this.energy_type = energy_type;
	}

	public int getAccelerate() {
		return accelerate;
	}

	public void setAccelerate(int accelerate) {
		this.accelerate = accelerate;
	}

	public int getBrake() {
		return brake;
	}

	public void setBrake(int brake) {
		this.brake = brake;
	}
	
}
	

