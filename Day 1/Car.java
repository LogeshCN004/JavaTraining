//Java Program to print Brand and Year of a Car 
class Car {
String brand;
    int year;
    void display() {
        System.out.println("Brand: "+brand);
        System.out.println("Year: "+year);
    }
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "Mini Cooper";
        c1.year = 2015;
        c1.display();
    }
}
// Output:
// Brand: Mini Cooper
// Year: 2015
