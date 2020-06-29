//perform linear search in array
import java.util.*;
public class Linearsearch
{
	public static void main(String[] args) {
		int[] a= new int [8];
		int f=0,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array");
		for ( i=0;i<8 ;i++ )
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the no to be search");
        int m=sc.nextInt();
        for ( i=0;i<8 ;i++ ) 
        {
        	if(a[i]==m)
        	{ f=1;
        	  break;
        	}
        }
        if (f==1)

        	System.out.println("No is found at"+(i+1));
        else
        	System.out.println("No not found");
	}
}