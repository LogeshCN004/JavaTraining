// Java Program to display the book's details
class Book {
    String title;
    String author;
    void display() {
        System.out.println("Title:"+title);
        System.out.println("Author:"+author);
    }
    public static void main(String[] args){
        Book b1 = new Book();
        b1.title = "Gulliver's Travel";
        b1.author = "Jonathan Swift";
        b1.display();
    }
}
// Output:
// Title: Gulliver's Travels
// Author: Jonathan Swift
