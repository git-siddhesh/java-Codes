import java.util.Scanner;
   public class ExceptionHandling{
   	public static void main(String[] args){
  		System.out.println("Enter the nos to divide:");
  		Scanner sc = new Scanner(System.in);
  		//int a=sc.nextInt();
  		//int b= sc.nextInt();
  		int a=10;int b=0;
  		/**/try{		
  			System.out.println("hey");					//	Default throw our catch
  			System.out.println(a/b);
  			System.out.println("Bye");
  		}
  		catch(ArithmeticException e)
  		{
  			System.out.println("Exception :"+e.getMessage());
  		}System.out.println("After catch");
  		/**/
  		/*try{								//Default throw our catch
  			System.out.println(a/b);
  		}
  		catch(Exception e)
  		{
  			System.out.println("Exception :"+e.getMessage());
  		}*/


      //NullPointerException Example
      String str = null;
      System.out.println("String length: "+str.length());   //It is a run time error
      // Illegal use of length function 
      NullPointerException e2 = new NullPointerException();
      System.out.println("rrg .."+e2.getMessage());
   	}
   }