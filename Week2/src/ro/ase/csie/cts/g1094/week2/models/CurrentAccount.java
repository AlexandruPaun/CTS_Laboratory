package ro.ase.csie.cts.g1094.week2.models;

import ro.ase.csie.cts.g1094.week2.exceptions.IllegalTransferException;
import ro.ase.csie.cts.g1094.week2.exceptions.InsufficentFundsException;

public class CurrentAccount extends BankAccount {

		
	public static final double MAX_CREDIT=5000;
	
	public CurrentAccount(String iban) {
		super(iban, CurrentAccount.MAX_CREDIT);
	}
	
	@Override
	public void deposit(Double amount) {
		this.balance += amount;
		
	}

	@Override
	public void withdraw(Double amount) throws InsufficentFundsException {
		if(amount>this.balance) {
			throw new InsufficentFundsException("Not enough money");
		}
		else {
			this.balance -= amount;
		}
		
	}

	@Override
	public void transfer(Account destination, Double amount) throws InsufficentFundsException ,IllegalTransferException{
		
		if(this == destination) {
			throw new IllegalTransferException();
		}
		this.withdraw(amount);
		destination.deposit(amount);
		
	}

	
}
