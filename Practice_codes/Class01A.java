public class Class01A
{
	public static void main(String[] args) {
		int a=args.length;
		for (int i=0;i<a;i++ ) {
			System.out.println(Integer.parseInt(args[i]));
		}
	}
}