package Intermediate;

public class Polyrunner {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		Triangle tri = new Triangle();
		
		rect.setValues(20, 20);
		tri.setValues(20, 20);
		double area = rect.Area();
		double triarea= tri.Area();
		
		Polygon poly=new Polygon();
		System.out.println(poly.Area());
		
		Polygon poly1= new Rectangle();
		Polygon poly2= new Triangle();
		poly1.setValues(20, 30);
		poly2.setValues(20, 30);

		System.out.println(poly1.Area());
		System.out.println(poly2.Area());
		
		System.out.println("Area of Rectangle: "+area);
		System.out.println("Area of triangle: "+triarea);
	}

}
