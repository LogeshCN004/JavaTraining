// Java Program to show specs of a mobile
public class Mobile {
    String brand;
    int price;
    String specs;
    void display() {
        System.out.println("Brand: "+brand);
        System.out.println("Price: "+price);
        System.out.println("Specs: "+specs);
    }
    public static void main(String [] args) {
        Mobile m1 = new Mobile();
        m1.brand = "Redmi Note 5";
        m1.price = 18000;
        m1.specs = "6GB RAM, 128GB Storage, 8MP front camera, 12MP rear camera";
        m1.display();
    }
}
// Output:
// Brand: Redmi Note 5 
// Price: 18000
// Specs: 6GB RAM, 128GB Storage, 8MP front camera, 12MP rear camera
