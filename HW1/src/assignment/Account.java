package assignment;

public class Account implements RatesInterface{
	public double loanValue, rate;	
	public int	daysActive;
	public AccountType accountType;
	
	public void printLoanValue() {
		System.out.println("The loan value is " + this.loanValue);
	}
	
	public double getLoan() {
		return this.loanValue;
	}
	
	public double getRate() {
		return this.rate;
	}
	
	public void printRate() {
		System.out.println("The rate is "+ this.rate);
	}
	
	public double computeMonthlyRate() {
		return loanValue*rate;
	}
	
	public void setValue(double value) throws ValueException {
		if(value < 0)
			throw new ValueException();
		else
		{
			loanValue = value;
		}
	}
	
	@Override
	public String toString() {
		return "Account [loanValue=" + loanValue + ", rate=" + rate + ", daysActive=" + daysActive + ", accountType="
				+ accountType + "]";
	}

	public static double calculate(Account[] accounts) {
	double totalFee = 0.0;
	Account	account;
	int temp = 365;
	for	(int i = 0; i < accounts.length; i++) {
	account = accounts[i];
	if(account.accountType==AccountType.PREMIUM || account.accountType==AccountType.SUPER_PREMIUM)	
	totalFee+= 1.25 / 100 * (	
			account.loanValue*Math.pow(account.rate,(account.daysActive/temp)) - account.loanValue);	
	}
	return	totalFee;
	}

	public Account(double value, double rate, AccountType accountType) throws ValueException {
		if(value < 0)
			throw new ValueException();
		else {
			this.loanValue = value;
		}
		this.rate = rate;
		this.accountType = accountType;
	}
	
}
