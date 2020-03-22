
public class Book {

	private String title;
	private String author;

	Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	// Declare your class here. Do not use the 'public' access modifier.
	// Declare the price instance variable

	class MyBook extends Book {
		int price;

		MyBook(String title, String author, int price) {
			super(title, author);
			this.price = price;
		}

		void display() {
			System.out.println("Title: " + title);
			System.out.println("Author: " + author);
			System.out.println("Price: " + price);
		}
	}

}
