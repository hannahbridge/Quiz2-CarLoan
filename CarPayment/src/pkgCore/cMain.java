package pkgCore;

public class cMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Car CAR2 = new Car(140000.00,55000.00,72,.07);

		System.out.println(CAR2.calculateMonthlyCarPayment());
		System.out.println(CAR2.calculateLoanInterestTotal());
		
	}

}
