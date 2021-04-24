package Books;

public class Fiction extends Book{

	public Fiction(String BookTitle) {
		super(BookTitle);
		setBookPrice();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setBookPrice() {
		// TODO Auto-generated method stub
		BookPrice = 24.99;
		
	}

	void display() {
		System.out.println("The title of this Fiction book is" + getBookTitle() + "$" + getBookPrice());
	}
}
