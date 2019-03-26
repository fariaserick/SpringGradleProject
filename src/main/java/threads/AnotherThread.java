package threads;
import static threads.ThreadColor.ANSI_GREEN;

public class AnotherThread extends Thread {
	
	@Override
	public void run() {
		System.out.println(ANSI_GREEN + "Hello from " + currentThread().getName());
	}
}
