package UseInsurance;

import java.util.Scanner;

public class UseInsurance {
	public static void main(String[] args) {
		
		System.out.print("Choose an insurance type: \n 1. Health \n 2. Life \n");
		Scanner scanner = new Scanner(System.in);
		int Num = scanner.nextInt();
		if(Num == 1)
		{
			Health healthIns = new Health();
			healthIns.display();
		
		}
		else
		{
			Life lifeIns= new Life();
			lifeIns.display();	
		}
	}
}
