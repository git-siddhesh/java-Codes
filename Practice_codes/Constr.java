import java.util.*;
class area{
	private int rad,len,bre;
	private double height,base;
	area(int r)
	{
		rad=r;
	}
	area(int a,int b)
	{
		len=a;
		bre=b;
	}
	area(double h,double b)
	{
		height=h;
		base=b;
	}
	public void rect()
	{
		System.out.println("Area="+(len*bre));
	}
	public void circle()
	{
		System.out.println("Area="+(3.14*rad*rad));
	}
	public void triangle()
	{
		System.out.println("Area="+(0.5*height*base));
	}

}
public class Constr
{
	public static void main(String[] args) {
		area a1=new area(7);
		area a2=new area(5,6);
		area a3=new area(10.0,2.0);
		a1.circle();
		a2.rect();
		a3.triangle();
	}
}
