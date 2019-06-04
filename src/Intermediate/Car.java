package Intermediate;

public class Car {
	
	private String make;
	private  String model;
	private int engine_cc;
	private String color;
	private String body_type;
	private int speed;
	
	Car(){
		
	}
	
	
	Car(String ma,String mo,int cc,String colo,String bo){
		
		setMake(ma);model=mo;engine_cc=cc;color=colo;bo=body_type;speed=0;
		
	}
	public void accelerate(int s) {
		this.speed =s;
		
	}
	public void brake() {
		speed--;
	}
	public int getSpeed() {
		return speed;
	}
	
	public void setMake (String m) {
		this.make=m;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getEngine_cc() {
		return engine_cc;
	}


	public void setEngine_cc(int engine_cc) {
		this.engine_cc = engine_cc;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getBody_type() {
		return body_type;
	}


	public void setBody_type(String body_type) {
		this.body_type = body_type;
	}


	public String getMake() {
		return make;
	}

}
