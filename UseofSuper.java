class Base{

	public int x;    //Instance variable of base class
}
class derived extends Base
{
	public int x;	//Instance variable of derived class 
	public void f1(){		//local variable of function f1
		x=5;     //it would initialize the local variable
		this.x=10;//It will initialize the instance variable of derived
		super.x=20;//It will initialize the instance variable of base class
		System.out.println("derived local variable"+x);
		System.out.println("derived instance variable"+this.x);
		System.out.println("base instance variable"+super.x);
	}
	
}
public class UseofSuper{
	public static void main(String[] args) {
		derived b2= new derived();
		b2.f1();

	}
}