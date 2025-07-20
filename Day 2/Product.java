package logesh;
import java.util.Scanner;
class Product {
	String name, category;
	double price;
	Product(String name, String category, double price) {
		this.name = name;
		this.price = price;
		this.category = category;
	}
	void calculateGST() {
		double gst;
		if(category.equalsIgnoreCase("Electronics")) {
			gst = 0.18;
		} else if(category.equalsIgnoreCase("Groceries")) {
			gst = 0.05;
		} else if(category.equalsIgnoreCase("Clothes")) {
			gst = 0.12;
		} else {
			gst = 0.0;
		}
		double gstAmount = price * gst;
		double finalPrice = price + gstAmount;
		System.out.println("\n------Product Bill------");
		System.out.println("Product Name: "+name);
		System.out.println("Product Category: "+category);
		System.out.println("Original Price: "+price+" Rupees");
		System.out.println("GST Amount: "+gstAmount+" Rupees");
		System.out.println("Final Price: "+finalPrice+" Rupees");
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Product Name: ");
		String n = sc.nextLine();
		System.out.print("Enter Product Category: ");
		String c = sc.nextLine();
		System.out.print("Enter Product Price: ");
		double p = sc.nextDouble();
		sc.nextLine();
		Product p1 = new Product(n, c, p);
		p1.calculateGST();
		sc.close();
		}
	}

