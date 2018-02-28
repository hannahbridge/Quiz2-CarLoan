package pkgCore;

public class Car 
{
	private double carCost;			//total price of car (sticker price + taxes + extra)
	private double downPayment;
	private int loanLength;			//in months
	private double interestRate;
	
	public Car(double cCost, double downPay, int lLength, double iRate)
	{
		this.carCost = cCost;
		this.downPayment = downPay;
		this.loanLength = lLength;
		this.interestRate = iRate;
	}
	
	public double getCarCost() 
	{
		return carCost;
	}

	public void setCarCost(double carCost) 
	{
		this.carCost = carCost;
	}

	public double getDownPayment() 
	{
		return downPayment;
	}

	public void setDownPayment(double downPayment) 
	{
		this.downPayment = downPayment;
	}

	public int getLoanLength() 
	{
		
		return loanLength;
	}

	public void setLoanLength(int loanLength) 
	{
		this.loanLength = loanLength;
	}

	public double getInterestRate() 
	{
		return interestRate;
	}

	public void setInterestRate(double interestRate) 
	{
		this.interestRate = interestRate;
	}

	public double calculateMonthlyCarPayment()
	{
		double I12 = this.interestRate / 12.0;
		return (I12 * (carCost - downPayment)) / (1 - Math.pow((1 + I12), -loanLength));
	}
	
	public double calculateLoanInterestTotal()
	{
		return (this.calculateMonthlyCarPayment() - ((carCost - downPayment) / loanLength)) * loanLength;
	}
	
}
