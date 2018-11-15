package thread1;

class RunnableRunner implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Hello: "+i);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

public class RunnableApp {

	public static void main(String[] args) {
		Thread t1 = new Thread(new RunnableRunner());
		t1.start();
		
		Thread t2 = new Thread(new RunnableRunner());
		t2.start();
	}
}
