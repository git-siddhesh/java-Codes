 class test
{
	public static int x=1;
	public int y=7;
	static{
		System.out.println("Static Initialization Block 1 "+(++x));
	}
	{
	//	System.out.println("Initialization Block 2"+(++x)+(++y));
	}
	test()
	{
		System.out.println("Constructor Call "+(++x)+(++y));
	}
	{
	//	System.out.println("Initialization Block 3"+(++x)+(++y));
	}

}
public class InitializationBlock 
{
	public static void main(String[] args) {
		test t= new test();
				test t2= new test();

	}
}