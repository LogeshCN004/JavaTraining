import java.util.Scanner;
public class Movie {
    String title;
    double ratings;
    void showDetails() {
        System.out.println("Title: "+title);
        System.out.println("Ratings:"+ratings);
    }
    public static void main(String[] args) {
        Movie m1 = new Movie();
        Scanner sc = new Scanner(System.in);
        System.out.println("Title: ");
        m1.title = sc.nextLine();
        System.out.println("Ratings: ");
        m1.ratings = sc.nextDouble();
        m1.showDetails();
        sc.close();
    }
}
