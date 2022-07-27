abstract class GeneralBank
{
	abstract double getSavingsInterestRate();
	abstract double getFixedDepositInterestRate();
	
}
class ICICIBank extends GeneralBank
{
	double getSavingsInterestRate()
	{
		return 5;
	}
	double getFixedDepositInterestRate()
	{
		return 8;
	}
}
class KotMBank extends GeneralBank
{
	double getSavingsInterestRate()
	{
		return 6;
	}
	double getFixedDepositInterestRate()
	{
		return 10;
	}
}
public class Bank 
{

	public static void main(String[] args) 
	{
		ICICIBank iciciBank=new ICICIBank();
		KotMBank kotMBank=new KotMBank();
		System.out.println("ICICI BANK: " +   "Fixed Rate = " + iciciBank.getFixedDepositInterestRate() + "%, " +   
				                      "Saving Rate = " + iciciBank.getSavingsInterestRate() + "%");  
		System.out.println("KOTAK MAHINDRA BANK: " +  "Fixed Rate = " + kotMBank.getFixedDepositInterestRate() + "%, " +   
				                      "Saving Rate = " + kotMBank.getSavingsInterestRate() + "%");  
		System.out.println("----------------------------------------------------------");  
		GeneralBank gBank1 = new ICICIBank();  
		GeneralBank gBank2 = new KotMBank();  
		System.out.println("GENERAL BANK1: " + "Fixed Rate = " + gBank1.getFixedDepositInterestRate() + "%, " +   
				                      "Saving Rate = " + gBank1.getSavingsInterestRate() + "%");  
		System.out.println("GENERAL BANK2: " +  "Fixed Rate = " + gBank2.getFixedDepositInterestRate() + "%, " +   
				         "Saving Rate = " + gBank2.getSavingsInterestRate() + "%");       

		
		
		

	}

}
