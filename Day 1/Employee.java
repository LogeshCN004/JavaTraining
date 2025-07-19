import java.util.Scanner;
public class Employee {
    String name;
    double salary;
    void displayInfo() {
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Employee e1 = new Employee();
      System.out.println("Name:");
      e1.name = sc.nextLine();
      System.out.println("Salary:");
      e1.salary = sc.nextDouble();
      e1.displayInfo();  
    }
}
