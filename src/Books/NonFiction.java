package Books;

public class NonFiction extends Book {

	public NonFiction(String BookTitle) {
		super(BookTitle);
		setBookPrice();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setBookPrice() {
		// TODO Auto-generated method stub
		BookPrice = 37.99;
		
	}

	void display() {
		System.out.println("The title of this Non-Fiction book is" + getBookTitle() + "$" + getBookPrice());
	}
}
