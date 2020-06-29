import java.util.Scanner;
 class Rect{
 	int l,b;
 	Scanner sc= new Scanner();
 	void input(){
 	System.out.println("enter the value of length and breadth");
 	l=sc.nextInt();
 	b=sc.nextInt();
 	System.out.println("Area"+ l*b)
   }
}
public class vol extends Rect
{
	int h;
	int v;
	Scanner sc=new Scanner();
	void read()
	{
		System.out.println("enter the value of height");
		h=sc.nextInt();
		v=super.l * super.b * h;
		System.out.println("volume is "+v);

	}
	public static void main(String[] args) {
		Rect r = new Rect();
		r.input();
		r.read();
	}
}
