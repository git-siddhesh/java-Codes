import java.util.Scanner;
public class Arrayinjava{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=5;
		int[] arr;
		arr=new int[x];

		int y=arr.length;
		for (int i=0;i<x ;i++ ) {
			arr[i]=sc.nextInt();
		}
		for (int i=0;i<5 ;i++ ) {
			
		System.out.println(arr[i]);
		}
		System.out.println("length: "+y);
		String s="NUll";
		try{
		System.out.println(s.length());
		}
		catch(Exception e){
			System.out.println("Please enter the value in string");
		}
		try{
			System.out.println((y/0));
		}
		catch(Exception e)
		{
			System.out.println("Error due to 0");
		}
	}
}