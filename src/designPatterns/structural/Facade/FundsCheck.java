package designPatterns.structural.Facade;

public class FundsCheck {
	
	private double cashInAccount = 1000;
	
	public double getCashInAccount() {
		return cashInAccount;
	}
	
	public void decreaseCashInAccount(double cashWithDraw) {
		cashInAccount -= cashWithDraw;
	}
	public void increaseCashInAccount(double cashDeposited) {
		cashInAccount += cashDeposited;
	}
	
	public boolean haveEnoughMoney(double cashToWithdrawal) {
		if(cashToWithdrawal > getCashInAccount()) {
			System.out.println("Not enough balance. Cash available = "+getCashInAccount());
			return false;
		} else {
			decreaseCashInAccount(cashToWithdrawal);
			System.out.println("Withdraw complete. balance = " + getCashInAccount());
			return true;
		}
	}
	
	public void makeDeposit(double cashToDeposit) {
		increaseCashInAccount(cashToDeposit);
		System.out.println("Deposit complete. Cash available = "+getCashInAccount());
	}

}
