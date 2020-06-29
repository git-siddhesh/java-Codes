//decimal to binary
import java.util.Scanner;
public class DecimaltoBinary{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;		// declare a variable for decimal no
		int[] binary= new int[5];
		System.out.println("enter the decimal no <16");
		a= sc.nextInt();
		System.out.println("the binary representation is in 4 bit");
		for (int i=0;i<4 ;i++ ) {
			binary[4-i]=a%2;
			System.out.print(binary[i]);
			a=a/2;
		}

	}
}