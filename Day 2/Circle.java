// Java Program to print the circumference and color of a circle using parameterized constructor 
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
		System.out.println("Color: "+color);
	}
	public static void main(String []args) {
		Circle c1 = new Circle(5.50, "Red");
		c1.getCircumference();
		Circle c2 = new Circle(7.25, "Blue");
		c2.getCircumference();
	}
}
// Output:
// Circumference: 34.54
// Color: Red
// Circumference: 45.53
// Color: Blue
