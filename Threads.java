class A implements Runnable{
	public void run(){
		for (int i=0;i<10 ;i++ ) {
		System.out.println("Threads A"+i);
	}
	}
}
class B implements Runnable{
	public void run(){
		for (int i=0;i<10 ;i++ ) {
		System.out.println("Threads B"+i);
	}
	}
}
class C implements Runnable{
	public void run(){
		for (char c=64;c<77 ;c++ ) {
		System.out.println("Thread C "+c);	
		}
	}
}

public class Threads{

	public static void main(String[] args) {
		Thread t1 = new Thread(new A());
		Thread t2 = new Thread(new B());
		Thread t3 = new Thread(new C());
		t1.start();
		t3.start();
		t2.start();
	}
}