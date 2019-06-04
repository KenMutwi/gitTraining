package Advanced;

public class Commuter {
	
	private String make,model,color;
	protected int speed;
	private int topSpeed;
	
	
	
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void accelerate() {
		speed++;
		
		
	}
	public void brake() {
		speed--;
	}

}
