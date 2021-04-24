package Books;

public abstract class Book {
private String BookTitle;
double BookPrice;

public Book(String BookTitle) {
	this.BookTitle = BookTitle;
	this.BookPrice = 0.0;
}

public String getBookTitle() {
	return BookTitle;
}


public double getBookPrice() {
	return BookPrice;
}

public abstract void setBookPrice();

}