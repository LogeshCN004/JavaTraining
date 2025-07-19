 import java.util.Scanner;

 class Calculator {
    
    void display(int a,int b) {
        int num3=a+b;
        System.out.println(num3);

    }
     public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println("Num 1:"+x);
        int y=sc.nextInt();
        System.out.println("Num2 2:"+y);
        Calculator c1 = new Calculator();
        c1.display(x,y);
        sc.close();
    
}
}

   