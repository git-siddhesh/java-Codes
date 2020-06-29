class box{
	private int l,b,h;
	public box setdimension(int l,int b,int h) //instance member function
	{
			this.l=l;this.b=b;this.h=h;
			return this;
	}
	public box show(){
		System.out.println("Values are"+l+b+h);
		return this;
	}
}
public class UseofThis{
	public static void main(String[] args) {  
		box b1=new box();
		box b2=new box();
		b1.setdimension(10,12,5);
		b1.show();
		b2.setdimension(1,2,3).show();

	}
}