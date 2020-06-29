package p1;
import java.util.Scanner;
public class Array{
	public static void main(String[] args) {
		int a[]= new int[5];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the array");
		for (int i=0;i<5 ;i++ ) {
			a[i]=sc.nextInt();
		}
		for (int j=0;j<5 ;j++ ) {
			System.out.println(a[j]);
		}
	}
}
