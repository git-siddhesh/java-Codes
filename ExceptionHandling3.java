import java.io.*;

public class ExceptionHandling3{

	/*public static void main(String[] args) throws IOException
	{
		throw new IOException("ExceptionHandling3");

	}*/
	public static void main(String[] args) {
		try
		{
			throw new IOException(" my  Exception");
		}
		catch(IOException e)
		{
				System.out.println("Exception:"+ e.getMessage());
		}
	}
}