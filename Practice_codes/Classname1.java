class Box
{
	private int len, bre, hig;
	public void setDimension(int l,int b,int h)
	{
		len=l;
		bre=b;
		hig=h;
	}
	void shoeDimension()
	{
		System.out.println("lenght="+len);
		System.out.println("breath="+bre);
		System.out.println("height="+hig);
	}
};
public class Classname1
{
	public static void main(String[] args) {
	Box smallbox= new Box();
	smallbox.shoeDimension();
	smallbox.setDimension(10,11,12);	
	smallbox.shoeDimension();
	}
};