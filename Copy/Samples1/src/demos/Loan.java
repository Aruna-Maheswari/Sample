package demos;

public class Loan {
	int bank()
	{
		int loanamount=3000;
		int rate=4;
		int interest=loanamount*rate;
		return interest;
		
	}
	public static void main(String args[])
	{
		Loan a=new Loan();
		System.out.println("Interest is:"+a.bank());
	}

}
