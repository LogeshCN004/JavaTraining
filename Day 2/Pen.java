// Java Program to display 3 Pen objects and their details using parameterized constructor
package logesh;

public class Pen {
	String brand;
	String color;
	int price;
	Pen(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	void showDetails() {
		System.out.println("Brand: "+brand);
		System.out.println("Color: "+color);
		System.out.println("Price: "+price);
	}
	public static void main(String [] args) {
		Pen p1 = new Pen("Nataraj", "Blue", 10);
		Pen p2 = new Pen("Reynolds", "Black", 15);
		Pen p3 = new Pen("Flair", "Blue", 5);
		p1.showDetails();
		System.out.println("-----");
		p2.showDetails();
		System.out.println("-----");
		p3.showDetails();
	}
}
// Output: 
// Brand: Nataraj
// Color: Blue
// Price: 10
// -----
// Brand: Reynolds
// Color: Black
// Price: 15
// -----
// Brand: Flair
// Color: Blue
// Price: 5
