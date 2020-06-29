//Use of class maths in mathematical calculation
 import java.util.Scanner;
 public class MathClass
 {
    public static void main(String[] args) {
    	double x,sqrts,cbrts,sq;
    		Scanner sc=new Scanner(System.in);
    	System.out.println("Enter a positive no ");
    	x=sc.nextDouble();
    //	sqrts=Math.sqrt(x);
    	cbrts=Math.cbrt(x);
    	//sq=Math.pow(x,2);
    	System.out.println(cbrts );
    
    }
 }