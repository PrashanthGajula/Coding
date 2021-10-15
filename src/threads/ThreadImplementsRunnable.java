package threads;

public class ThreadImplementsRunnable implements Runnable{
	
	Thread t;
	PrintDemo pd;
	String threadName;
	
	

	public ThreadImplementsRunnable(String threadName, PrintDemo pd) {
		super();
		this.threadName = threadName;
		this.pd = pd;
	}
	
	public void start() {
		System.out.println("Starting "+ threadName);
		if(t==null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}

	@Override
	public void run() {
		pd.printCount();
		System.out.println("Thread " + threadName + " exiting");
	}
}
