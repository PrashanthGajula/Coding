package designPatterns.creational.Singleton;


/**
 * Types of initialization.
 * 1. Eager
 * 2. Lazy
 * 3. Use of synchronized
 * 4. double checked locking
 * @author prashanth
 *
 */

public class SingletonDesignPattern {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Manager manager1 = Manager.getManager();
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Manager manager2 = Manager.getManager();
			}
		});
		
		t1.start();
//		try {
//			Thread.sleep(500);
//		} catch (Exception e) {
//		}
		t2.start();

	}

}


class Manager{
	static Manager manager;
	
	//to avoid direct initialization 
	private Manager() {
		System.out.println("Manager Instance created");
		
	}
	
	//lazy
//	public static Manager getManager() {
//		if(manager == null) {
//			manager = new Manager();
//		}
//		return manager;
//	}
	
	
	//Synchronized
//	public static synchronized Manager getManager() {
//		if(manager == null) {
//			manager = new Manager();
//		}
//		return manager;
//	}
	
	//double checked locking
	public static Manager getManager() {
		if(manager == null) {
			synchronized(Manager.class) {
				if(manager == null) {
					manager = new Manager();
				}
			}
		}
		return manager;
	}
}
