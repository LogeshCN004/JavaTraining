package logesh;

public class Circle {
	String color;
	double radius;
	Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	void getCircumference() {
		double circumference = 2*3.14*radius;
		System.out.println("Circumference: "+circumference);
	}
	public static void main(String []args) {
		Circle c1 = new Circle(5.50, "Red");
		c1.getCircumference();
		Circle c2 = new Circle(7.25, "Blue");
		c2.getCircumference();
	}
}
