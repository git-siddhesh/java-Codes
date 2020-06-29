class superclass{
	public void f1(int x)
	{
		System.out.println("Class Super");
	}
}
class subclass extends superclass
{
	public void f1(int x)
	{
		System.out.println("Class sub");
	}
}
public class opover
{
	public static void main(String[] args) {
		subclass s = new subclass();
		s.f1(5);
		superclass s2 = new superclass();
		s2.f1(3);
	}
}