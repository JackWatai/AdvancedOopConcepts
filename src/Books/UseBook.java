package Books;

public class UseBook {
public static void main(String [] args) {
	Book [] books = new Book[6];
	books[0] = new Fiction("Jane Eyre");
	books[1] = new Fiction("The Alchemist");
	books[2] = new Fiction("The Vegetarian");
	books[3] = new NonFiction("In Cold Blood");
	books[4] = new NonFiction("A Brief History of Time");
	books[5] = new NonFiction("Hiroshima");
	
	for(int i = 0; i < books.length; ++i)
		System.out.println("Book: " + books[i].getBookTitle() + ", Price: " + books[i].getBookPrice() + "$");
}
}
