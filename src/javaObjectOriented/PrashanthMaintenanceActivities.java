package javaObjectOriented;

public class PrashanthMaintenanceActivities implements HouseMaintanence {

	@Override
	public void payBills() {
		System.out.println("Prashanth paid bills");
		
	}

	@Override
	public void payRent() {
		System.out.println("Prashanth paid rent");
		
	}

	@Override
	public void reportIssues() {
		System.out.println("Prashanth reported no issues");	
	}
}
