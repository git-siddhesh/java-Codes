// Wap to find factorial using function
import java.util.*;
public class Factclass{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no");
		int n= sc.nextInt();
		fact f=new fact(n);   //call obj of fact class
		int a;
		a=f.factorial();
			System.out.println("Factorial is"+ a);
		}
}