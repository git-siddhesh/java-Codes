// Wap to find factorial using function
import java.util.*;
public class Factclass{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no");
		int n= sc.nextInt();
		fact f=new fact();   //call obj of fact class
		int a;
		a=f.factorial(n);
			System.out.println("Factorial is"+ a);
		}
}//Class for recursion function ++
class fact
{

	public int factorial(int b)
	{
		if(b==0)
			return 1;
		return (b*factorial(b-1));
	}
}