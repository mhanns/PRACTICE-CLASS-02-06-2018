//Maurice Hanns CSC 242 02/06/2018

import java.util.Scanner;

public class aboutBook {

	public static void main(String[] args) {
	// TODO Auto-generated method stub

		 
	Scanner input = new Scanner (System.in);
	 
		System.out.println("Please enter the books author: ");
		String bkAthr = input.nextLine();

		System.out.println("Please enter the book ISBN number: ");
		String bkISBN = input.nextLine();

		System.out.println("Please enter the books price: ");
		double bkPrice = input.nextDouble();

		System.out.println("Please enter the year the book was published: ");
		int yrPB = input.nextInt();

	    Book books = new Book(bkAthr, bkISBN, yrPB, bkPrice);

	    System.out.println(books.BookAuthor + ", "+ books.BookISBN + ", "+ books.yearPub + ", "+ books.bookPrice);

	}

}
