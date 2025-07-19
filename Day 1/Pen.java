// Java Program to to print details of a pen
import java.util.Scanner;
class Pen {
    String color;
    String brand;
    void write() {
        System.out.println("This "+brand+" pen writes in "+color+" color.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pen p1 = new Pen();
        System.out.println("Color:");
        p1.color = sc.nextLine();
        System.out.println("Brand:");
        p1.brand = sc.nextLine();
        p1.write();
        sc.close();
    }
}
// Output:
// Color: Blue
// Brand: Reynolds
// This Reynolds pen writes in Blue color.
