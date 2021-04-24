package UseInsurance;

public class Life extends Insurance {
public Life() {
		super("life");
		setCost();
		// TODO Auto-generated constructor stub
	}

private double lifeCost = 36;

@Override
void setCost() {
	// TODO Auto-generated method stub
	price = lifeCost;
}

@Override
void display() {
	// TODO Auto-generated method stub
	System.out.print("Insurance type: " + getType() + ", Monthly cost: " + getPrice());
}

}
