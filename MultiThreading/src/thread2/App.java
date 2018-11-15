package thread2;

import java.util.Scanner;

class Processor extends Thread{

	private volatile boolean running = true;
	
	@Override
	public void run() {
		
		while(running) {
			System.out.println("Hello");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void shutdown() {
		running = false;
	}
}

public class App {

	public static void main(String[] args) {
		Processor p1 = new Processor();
		p1.start();
		
		System.out.println("Hit return to stop.");
		Scanner src = new Scanner(System.in);
		src.nextLine();
		
		p1.shutdown();
	}
}
