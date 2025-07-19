package logesh;

public class Shapes {
	int length;
	int breadth;
	Shapes(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	void print() {
		if(length == breadth) {
			System.out.println("It's a Square");
		}
		else {
			System.out.println("It's a Rectangle");
		}
	}
	public static void main(String [] args) {
		Shapes s1 = new Shapes(10, 10);
		System.out.println("Length: "+s1.length+", Breadth: "+s1.breadth);
		s1.print();
		Shapes s2 = new Shapes(10, 20);
		System.out.println("Length: "+s2.length+", Breadth: "+s2.breadth);
		s2.print();
	}
}
