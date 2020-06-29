public class UseofConst
{
	private int a,b;
	// private UseofConst(){a=10;b=20;
		//System.out.println("a and b are"+a+b);}
	 private UseofConst(int A,int B){a=A;b=B;
	System.out.println("a and b are"+a+b);}
	public static void main(String[] args) {
		//UseofConst b1=new UseofConst();
		UseofConst b2 = new UseofConst (22,33);
	}
}