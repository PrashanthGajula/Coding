package threads;

public class PrintDemo {
	public void printCount() {
		try {
			for(int i=5;i>0;i--) {
				Thread.sleep(500);
				System.out.println("Counter : "+i);
			}
		} catch (Exception e) {
			System.out.println("Thread interrupted");
		}
	}
}
