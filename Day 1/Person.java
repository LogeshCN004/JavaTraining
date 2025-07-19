//Java Program to print Name and Age using Instance method
class Person {
    String name;
    int age;
    void display() {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Adam";
        p1.age = 21;
        p1.display();
    }
}
//Output:
//Name: Adam
//Age: 21
