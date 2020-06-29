import java.util.Scanner;
public class practice{
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int old=a,sum=0,rem;
		while(a>0) {
			rem=a%10;
			rem=rem*rem*rem;
			sum=sum+rem;
			a=a/10;
		}
		if(sum==old)
			System.out.println("The no is armstrong");
		else 
			System.out.println("The no is not armstrong");

	}
}