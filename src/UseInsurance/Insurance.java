package UseInsurance;

public abstract class Insurance {
private String type;
protected double price;

public Insurance(String Insurancetype) {
 type = Insurancetype;
}

public String getType() {
	return type;
}

public double getPrice() {
	return price;
}

abstract void setCost();
abstract void display();


}
