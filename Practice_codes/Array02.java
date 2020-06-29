package p1;
import java.util.Scanner;
public class Array02{
	public static void main(String[] args) {
		int a[][]= new int[3][3];
		int b[][]= new int[3][3];
		int c[][]= new int[3][3];
		int sum;

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the 1st array");
		for (int i=0;i<3 ;i++ ) {
			for (int j=0;j<3 ;j++ )
			a[i][j]=sc.nextInt();
		}
		System.out.println("Enter the 2nd array");
		for (int i=0;i<3 ;i++ ) {
			for (int j=0;j<3 ;j++ )
			b[i][j]=sc.nextInt();
		}
		
		for (int i=0;i<3 ;i++ ) {
			for (int j=0;j<3 ;j++ ){
				sum=0;
				for ( int k=0;k<3 ;k++ ) {
					sum=sum+a[i][k]*b[k][j];
				}c[i][j]=sum;
			}
       		}
		for (int i=0;i<3 ;i++ ) {
			for (int j=0;j<3 ;j++ )
				System.out.print(" "+c[i][j]);
				System.out.println();
		}
		for (int i=0;i<3 ;i++ ) {
			for (int j=0;j<3 ;j++ )
			a[i][j]+=b[i][j];
		}
		for (int i=0;i<3 ;i++ ) {
			for (int j=0;j<3 ;j++ )
			System.out.println(a[i][j]);
		}
	}
}
