import java.util.Scanner;
 interface Rect{
 	int id=1;
 	int age=2;
 	String name="a";
 void input();
 void output();
}
public class interfaces implements Rect
{
	int mob[] = new int[10];
	String sec, dept;
	Scanner sc= new Scanner(System.in);
  public void input(){
 		System.out.println("enter the value of name age and id");
 		}
  public void output()
  	 {
  	 	System.out.println(id+(age)+name);
  	 }
	void read()
		{
			System.out.println("enter the value of mob,sec,dept");
			for (int i=0;i<10 ;i++ ) {
				mob[i]=sc.nextInt(); }
			sec= sc.next();
			dept=sc.next();
		}
	void write()
		{
			System.out.println(mob+sec+dept);
		}
	public static void main(String[] args) {
		interfaces vv= new interfaces();
	    vv.input();
	    vv.output();
		vv.read();
		vv.write();

	}
}
