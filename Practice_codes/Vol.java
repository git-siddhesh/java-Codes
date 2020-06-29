import java.util.Scanner;
 class Rect{
 	int l,b;
 	Scanner sc= new Scanner(System.in);
 	void input(){
 	System.out.println("enter the value of length and breadth");
 	l=sc.nextInt();
 	b=sc.nextInt();
 	System.out.println("Area"+ l*b);
   }
}
public class Vol extends Rect
{
	int h;
	void read()
	{
		System.out.println("enter the value of height");
		h=sc.nextInt();
		System.out.println("volume is "+super.l * super.b * h);

	}
	public static void main(String[] args) {
		Vol v= new Vol();
	    v.input();
		v.read();
	}
}
