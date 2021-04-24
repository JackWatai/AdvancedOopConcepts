package Books;

public class BookArray {
public static void main(String[] args) {
	Book [] books = new Book[10];
	
	books[0] = new Fiction("Jane Eyre");
	books[1] = new Fiction("The Alchemist");
	books[2] = new Fiction("Lord of the Flies");
	books[3] = new Fiction("The Vegetarian");
	books[4] = new Fiction("Frankentsein");
	books[5] = new NonFiction("A Brief History of Time");
	books[6] = new NonFiction("In Cold Blood");
	books[7] = new NonFiction("Hiroshima");
	books[8] = new NonFiction("Silent Spring");
	books[9] = new NonFiction("A Room of One's Own");
	
	System.out.println("Details: ");
	for(int i = 0; i < books.length; i++) {
		System.out.println("Book: " + books[i].getBookTitle());
		System.out.println("Price: " + books[i].getBookPrice() + "$");
	}
}
}
