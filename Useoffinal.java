class a{
	public final int x;
	a(){
		x=5;
	}
	public final static int y;
	static{
		y=19;
	}
	public final void show(){
			// x=x+!; Will give error since final variable cannot be initialized in methods
		System.out.println(x+y);
	}
}

public class Useoffinal extends a{
	/*public void show(){
												Will return erron since final methods cannot be override
		System.out.println("read called");
	}*/
	public static void main(String[] args) {
		a obj=new a();
		obj.show();
	}
}
	
