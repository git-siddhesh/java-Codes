  interface ab{
	void read();
}
abstract class child implements ab{
	abstract void show();
	void put(){

		System.out.println("put called");
	}
}

public class UseofAbstractClass extends child
{
	public void read()
	{
		System.out.println("read called");

	}
	public void show(){
		System.out.println("show called");
	}
	public static void main(String[] args) {
		UseofAbstractClass obj1 = new UseofAbstractClass();	
		//child obj = new child();	
		obj1.read();
		obj1.show();
		obj1.put();
	
	}
}
