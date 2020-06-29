import java.util.*;
class Student{
	int id,age;
	String name;
	String sec;
	int m1,m2,m3,m4;
	Scanner sc = new Scanner(System.in);
	public void getdata(){
		System.out.println("Enter the id,age,name and sec of the students");
		id=sc.nextInt();
		age=sc.nextInt();
		name=sc.next();
		sec=sc.next();
		System.out.println("Enter the marks of the students");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		m4=sc.nextInt();
	}
	public void putdata(){
		System.out.println("ID:"+id+"NAME:"+name+"AGE:"+age+"SEC:"+sec);
	}
}

interface Exam {
	void getExam();
	void putExam();
}																					 
public class InterfaceExam  extends Student implements Exam{
	Scanner sc=new Scanner(System.in);
	private String Ename;
	private int totalmarks,avg;
	public void getExam(){
		System.out.println("Enter Exam name");
		Ename=sc.next();
			getdata();
	}
	public void putExam(){
		putdata();
		System.out.println("Exam:"+Ename);
		totalmarks=m1+m2+m3+m4;
		avg=totalmarks/4;
		System.out.println("totalmarks:"+totalmarks+"Avg:"+avg);
	}

	public static void main(String[] args) {
		InterfaceExam e = new InterfaceExam();
		e.getExam();
		e.putExam();
	}
} 