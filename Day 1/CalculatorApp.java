// Java Program to perform basic arithmetic operation between two numbers
// Program should:
    // ask user to enter two numbers
    // ask user to choose operator
    // perform operation baased on chosen operator
    // Display Result
import java.util.Scanner;
class CalculatorApp {
    double A;
    double B;
    char operator;
    void displayResult() {
        double result;
        if(operator == '+') {
            result = A + B;
            System.out.println("Addition: "+result);
        }
        else if(operator == '-') {
            result = A - B;
            System.out.println("Subtraction: "+result);
        }
        else if(operator == '*') {
            result = A * B;
            System.out.println("Multiplication: "+result);
        }
        else if(operator == '/') {
            if(B!=0) {
            result = A / B;
            System.out.println("Division: "+result);
        }
            else {
                System.out.println("Error:Cannot divide by zero.");
            }
        }   
        else {
            System.out.println("Invalid operator.");
        }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculatorApp calc = new CalculatorApp();
        System.out.println("Value of A:");
        calc.A = sc.nextDouble();
        System.out.println("Value of B:");
        calc.B = sc.nextDouble();
        System.out.println("Operator:");
        calc.operator = sc.next().charAt(0);
        calc.displayResult();
        sc.close();
    }
}
// Output:
// Value of A: 25
// Value of B: 5
// Operator: /
// Division: 5
