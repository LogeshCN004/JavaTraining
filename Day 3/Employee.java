package logesh;

public class Employee {
	int empid;
	String name;
	double salary;
	Employee(int empid, String name, double salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	double calculatebonus() {
		if(salary > 50000) {
			return salary*0.10;
		}
		else {
			return salary*0.05;
		}
	}
	void display() {
		System.out.println("ID: "+empid);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
		System.out.println("Bonus: "+calculatebonus());
	}
	public static void main(String [] args) {
		Employee e1 = new Employee(1001, "Mohan", 45000);
		Employee e2 = new Employee(1002, "Rohan", 52500);
		e1.display();
		System.out.println("----------");
		e2.display();
	}
}
