package p1;
import java.util.Scanner;
public class Array01{
	public static void main(String[] args) {
		int a[]= new int[10];
		int sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the array");
		for (int i=0;i<10 ;i++ ) {
			a[i]=sc.nextInt();
		}
		for (int j=0;j<10 ;j++ ) {
			if(j%2==0)    // if j is even 
				sum+=a[j];   //sum+a[j]
		}
		System.out.println(sum);
	}
}
