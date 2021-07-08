package threads;

public class TestThreadWithoutSynchronization {

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
		
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	

}


