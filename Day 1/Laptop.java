// Java Program to show the details of a laptop
import java.util.Scanner;
class Laptop {
    String brand;
    String RAM;
    void showConfiguration() {
        System.out.println("Brand: "+brand);
        System.out.println("RAM: "+RAM);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Laptop l1 = new Laptop();
        System.out.println("Brand:");
        l1.brand = sc.nextLine();
        System.out.println("RAM:");
        l1.RAM = sc.nextLine();
        l1.showConfiguration();
        sc.close();
    }
}
// Outpuut:
// Brand: Lenovo LOQ
// RAM: 16GB
