import java.util.*;
class exam {
	private int s1,s2,s3,s4;
	protected float total, avg;
	protected void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the subjects marks");
		s1=sc.nextInt();
		s2=sc.nextInt();
		s3=sc.nextInt();
		s4=sc.nextInt();
		total=s1+s3+s2+s4;
		avg = total/4;
	}
	protected void output()
	{
		System.out.println("marks="+s1+s2+s3+s4);
	}
}
class marks extends exam{
	private int student_id;
	Scanner sc = new Scanner(System.in);

	public void getin(){
		System.out.println("Enter the student_id");
		student_id=sc.nextInt();
		input();
	}
	public void putout(){
		System.out.println("student_id="+student_id);
		output();
		if(super.eavg>40)
			System.out.println("PASS");
		else 
			System.out.println("FAIL");

	}
}
public class Result{
	public static void main(String[] args) {
		marks m = new marks();
		m.getin();
		m.putout();
	}
}