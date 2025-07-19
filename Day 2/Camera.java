package logesh;

public class Camera {
	String model;
	String resolution;
	int price;
	Camera(String model, String resolution, int price) {
		this.model = model;
		this.resolution = resolution;
		this.price = price;
	}
	double discountedPrice( double percent) {
		double discount = price - (price*percent/100);
		return discount;
	}
	void display() {
		System.out.println("Model: "+model);
		System.out.println("Resolution: "+resolution);
	}
	public static void main(String [] args) {
		Camera c1 = new Camera("Nikon MSR", "1080P", 25000);
		c1.display();
		System.out.println("Original Price: "+c1.price);
		double finalPrice = c1.discountedPrice(10);
		System.out.println("Discounted Price: "+finalPrice);
	}
}
