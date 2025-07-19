package logesh;

public class BookDiscount {
	String title;
	String category;
	double price;
	BookDiscount(String title, String category, double price) {
		this.title = title;
		this.category = category;
		this.price = price;
	}
	double getDiscountedPrice() {
		double discount = 0;
		if(category == "Fiction") {
			discount = 10;
		}
		else if(category == "Education") {
			discount = 20;
		}
		else if(category == "Others") {
			discount = 0;
		}
		double discountedPrice = price - (price * discount/100);
		return discountedPrice;
	}
	void display() {
		System.out.println("Book: "+title);
		System.out.println("Category: "+category);
		System.out.println("Price: "+price+" Rupees");
		System.out.println("Price after discount: "+getDiscountedPrice()+" Rupees");
		System.out.println("-----------------");
	}
	public static void main(String [] args) {
		BookDiscount b1 = new BookDiscount("Space Odyssey", "Fiction", 600);
		BookDiscount b2 = new BookDiscount("Data Structures", "Education", 1050);
		BookDiscount b3 = new BookDiscount("Day-Magazine", "Others", 300);
		b1.display();
		b2.display();
		b3.display();
	}
}
