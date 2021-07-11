package designPatterns.structural.Facade;

public class SecurityCodeCheck {
	private int securityCode = 1234;
	
	public int getSecurityCode() {return securityCode;}
	
	public boolean isCodeCorrect(int secCodeToCheck) {
		return secCodeToCheck == getSecurityCode()  ? true :false;
	}

}
