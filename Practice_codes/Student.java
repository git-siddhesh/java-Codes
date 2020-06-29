import java.util.*;
class detail
{
	Scanner sc=new Scanner(System.in);
	private String name, branch;
	private int id, age;
	public void getdata()
	      {
	      	System.out.println("Enter the Name");
	      	name=sc.next();
	     	System.out.println("Branch");
	      	branch=sc.next();
	      	System.out.println("id");
	      	id=sc.nextInt();
	      	System.out.println("age");
	      	age=sc.nextInt();
	      }
	public void show()
	      {
	      	System.out.println(" Name"+name);
	      	System.out.println("Branch"+ branch);
	      	System.out.println("id "+id);
	      	System.out.println("age"+ age);
	      }
} 
public class Student
{
	public static void main(String[] args) {
		detail d= new detail();
		d.getdata();
		d.show();
	}
}
