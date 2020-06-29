// Wap to find factorial using function
import java.util.*;
public class Factclass{g[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no");
		int n= sc.nextInt();
	public static void main(Strin
		//fact f=new fact();   //call obj of fact class
		int a;
		a=factorial(n);
			System.out.println("Factorial is"+ a);
		}
}

	public int factorial(int b)
	{
		if(b==0)
			return 1;
		return (b*factorial(b-1));
	}

