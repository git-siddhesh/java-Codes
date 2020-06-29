import java.util.Random;
 class sid{
	public void hi(int[] a)
	{System.out.println("hii called");

		for(int i =0;i<4;i++ )
			System.out.println(a[i]+" ");
	  }
}
 class sid2{
	public void hi2()
	{
		System.out.println("hii2 called");
	}
}
public class prac3 extends sid{

public static void main(String[] args) {
		sid m = new sid();
		sid2 n = new sid2();
		Random rand = new Random();
		int[] a = new int[4];
		for(int i =0;i<4;i++)
			a[i]=rand.nextInt(50);
		 m.hi(a);
		 n.hi2();
	}

}
