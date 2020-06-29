// another program  for inheritance in java
import java.util.*;
//class color{
	
//}
class car extends color
{
	protected String name;
	car()
	{ }
	 car(String a)
	{
		name=a;
	}
	public String showname()
	{
		return name;
	}
}
public class Inheritance3 extends car
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = sc.next();
		car c= new car(name);
		//c.getname(args[0]);
		System.out.println(c.showname());
	}
}