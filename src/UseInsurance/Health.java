package UseInsurance;

public class Health extends Insurance {
	public Health() {
		super("health");
		setCost();
		// TODO Auto-generated constructor stub
	}

private double healthCost = 196;

@Override
void setCost() {
	// TODO Auto-generated method stub
	price = healthCost;
}

@Override
void display() {
	// TODO Auto-generated method stub
	System.out.print("Insurance type: " + getType() + ", Monthly cost: " + getPrice());
}

}
