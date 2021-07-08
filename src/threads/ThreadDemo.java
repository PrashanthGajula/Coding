package threads;

public class ThreadDemo extends Thread{
	private Thread t;
	private String threadName;
	PrintDemo pd;
	
	public ThreadDemo(String name, PrintDemo pd) {
		this.pd = pd;
		threadName = name;
	}
	
	public void run() {
		//synchronized (pd) {
			pd.printCount();
		//}
		System.out.println("Thread "+ threadName + " exiting");
	}
	
	public void start() {
		System.out.println("Starting " +threadName);
		if(t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}
}
