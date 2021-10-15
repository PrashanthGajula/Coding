package threads;

public class PrintDemo {
	int num=1;
	public void printCount() {
		try {
			
			synchronized (this) {
				for(int i=5;i>0;i--) {
					Thread.sleep(500);
					System.out.println("Counter : "+i);
				}
			
			}
		} catch (Exception e) {
			System.out.println("Thread interrupted");
		}
	}
}
