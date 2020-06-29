//One important thing to notice that try cannot come alone 
// We need to write either catch or finally or both just after try ie there can be 0 or more catch block 

// All the lines in the try block should be dependent to previous line

// finally block should be written after catch block 
// There may be more thatn one catch block but there sholud be only one finally block
import java.io.*;
public class ExceptionHandling2{

	public static void main(String[] args) {
		int balance=2000;
		int withdrawal=3000;
		try{
			System.out.println("In try block");
			if(balance<withdrawal)                //our throw our catch
				throw new ArithmeticException("Insufficient Balance");    //From here program will directly jump to the catch 
																		//block never returns backs to try block
			balance=balance- withdrawal;							//not run, dependent on if condition 
			System.out.println("Transaction completed"+balance);    //not run, dependent on if condition
		}
		catch(NullPointerException ex)
		{
			System.out.println("Wrong Exception that
			 will not called"+ex.getMessage());
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception :"+e.getMessage());
		}
		// if all our catch block not called only then default catch block will run 
		finally{
		System.out.println("after catch block...\n\n");
		}

//============================================================================================
			// IOException //

		try
		{
			throw new IOException(" io  Exception\n");
		}
		catch(IOException e3)
		{
				System.out.println("Exception:"+ e3.getMessage());
		}


//============================================================================================

			// our throw default catch 
		int a=10,b=0;
		if(b==0) throw new ArithmeticException("\nValue of b can't be zero \n ");
	}	
}