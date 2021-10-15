package threads;

public class TestThreadWithoutSynchronization {

    int number =1;
	public static void main(String[] args) {
		
		
		PrintDemo pd = new PrintDemo();
		
		ThreadDemo t1 = new ThreadDemo("Thread - 1", pd);
		ThreadDemo t2 = new ThreadDemo("Thread - 2", pd);
		
		
		t1.start();
		try {
			
			t1.join();
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		t2.start();
		
		//ThreadImplementsRunnable rt1 = new ThreadImplementsRunnable("RunnableThread-1", pd);
		//rt1.start();
		
		
		
		
	}
	

}


