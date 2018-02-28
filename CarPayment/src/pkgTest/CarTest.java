package pkgTest;

import static org.junit.Assert.*;
import org.junit.Test;

import pkgCore.Car;

public class CarTest
{
	
	@Test
	public void test()
	{
		Car CAR1 = new Car(35000.00,0.00,60,.10);
		
		assertEquals((Math.round(CAR1.calculateMonthlyCarPayment() * 100) / 100.0), 743.65, .01);
		assertEquals((Math.round(CAR1.calculateLoanInterestTotal() * 100) / 100.0), 9618.79, .01);
		
		Car CAR2 = new Car(140000.00,55000.00,72,.07);
		
		assertEquals((Math.round(CAR2.calculateMonthlyCarPayment() * 100) / 100.0), 1449.17, .01);
		assertEquals((Math.round(CAR2.calculateLoanInterestTotal() * 100) / 100.0), 19339.92, .01);
		
		
	}
	
}