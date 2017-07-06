
class Hi extends Thread {
	public void run() {
		for(int i=0; i<5; i++){
			System.out.println("Hi");
			try{ 
				Thread.sleep(500);
			}catch(Exception e) {
			}
		}
	}
}

class Hello extends Thread {
	public void run() {
		for(int i=0; i<5; i++){
			System.out.println("Hello");
			try{ 
				Thread.sleep(500);
			}catch(Exception e) {
			}
		}
	}
}

public class ThreadsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hi hi = new Hi();
		Hello hello = new Hello();
		hi.start();
		hello.start ();
	}

}
