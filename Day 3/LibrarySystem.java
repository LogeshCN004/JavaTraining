package logesh;
import java.util.Scanner;
class LibrarySystem {
	String libname, libLocation;
	void libraryName(String libname) {
		this.libname = libname;
		System.out.println("Library Name: "+libname);
	}
	void libraryLocation(String liblocation) {
		this.libLocation = liblocation;
		System.out.println("Library Location: "+liblocation);
	}
}
class Section extends LibrarySystem {
	String secname;
	void sectionName(String secname) {
		this.secname = secname;
		System.out.println("Section Name: "+secname);
	}
}
class LibBook extends Section {
	String booktitle, bookauthor;
	void bookTitle(String booktitle) {
		this.booktitle = booktitle;
		System.out.println("Book Title: "+booktitle);
	}
	void bookAuthor(String bookauthor) {
		this.bookauthor = bookauthor;
		System.out.println("Book Author: "+bookauthor);
	}
}
class Lib {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		LibBook b1 = new LibBook();
		System.out.print("Enter Library Name: ");
		String ln = sc.nextLine();
		System.out.print("Enter Library Location: ");
		String ll = sc.nextLine();
		System.out.print("Enter Section: ");
		String sn = sc.nextLine();
		System.out.print("Enter Book Title: ");
		String bt = sc.nextLine();
		System.out.print("Enter Book Author: ");
		String ba = sc.nextLine();
		System.out.println("---------------\n");
		b1.libraryName(ln);
		b1.libraryLocation(ll);
		b1.sectionName(sn);
		b1.bookTitle(bt);
		b1.bookAuthor(ba);
		sc.close();
	}
}
