 package designPatterns.structural.Facade;

public class BankAccountFacade {
	private int accountNumber;
	private int securityCode;
	AccountNumberCheck acctChecker;
	SecurityCodeCheck codeChecker;
	FundsCheck fundChecker;
	
	WelcomeToBank bankWelcome;
	
	public BankAccountFacade(int newAccNo, int newSecCode) {
		accountNumber = newAccNo;
		securityCode = newSecCode;
		
		bankWelcome = new WelcomeToBank();
		acctChecker = new AccountNumberCheck();
		codeChecker = new SecurityCodeCheck();
		fundChecker = new FundsCheck();
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public int getSecurityCode() {
		return securityCode;
	} 
	
	public void withdrawCash(double cashtoget) {
		if(acctChecker.accountActive(accountNumber) && codeChecker.isCodeCorrect(securityCode) && fundChecker.haveEnoughMoney(cashtoget)) {
			System.out.println("Transaction complete\n");
		} else {
			System.out.println("Transaction fail\n");
		}
	}
	
	public void depositCash(double cashtowithdraw) {
		if(acctChecker.accountActive(accountNumber) && codeChecker.isCodeCorrect(securityCode)) {
			fundChecker.makeDeposit(cashtowithdraw);
			System.out.println("Transaction complete\n");
		} else {
			System.out.println("Transaction fail\n");
		}
	}

}
