import java.util.*; 
class login{
	Scanner sc = new Scanner(System.in);
private String user,pass;
public void in1(){
	System.out.println("Enter the Username and password");
	user=sc.next();
	pass=sc.next();
}
public void out1(){
	System.out.println("Username:"+user+"password:"+pass);
}
}
class train extends login{
	String trainname,source,destination;
	int tno;
	public void in2(){
	System.out.println("Enter the train name,no,source and destination");
	trainname=sc.next();
	tno=sc.nextInt();
	source=sc.next();
	destination=sc.next();
}
    public void out2(){
    	System.out.println("Train name:"+trainname+"Train no =:"+tno+"source:"+source+"destination:"+destination);
    }
}
class online_payment extends train{
	int cardno;
	String bankname;
	double amount;
	public void in3(){
		System.out.println("Enter the Bankname,cardno and amount");
		bankname=sc.next();
		cardno=sc.nextInt();
		amount=sc.nextDouble();
	}
	public void out3(){
		System.out.println("BANKNAME: "+bankname+"CARDNO: "+cardno+"AMOUNT: "+amount);
	}
}

interface Netbanking {
	void in4();
	void out4();
}
public class InterfaceExam2  extends online_payment implements Netbanking{
	Scanner sc=new Scanner(System.in);
	private String bname,username,password ;
  	private double amnt;
	public void in4(){
		System.out.println("Enter Bankname,username,password and AMOUNT");
		bname=sc.next();
		username=sc.next();
		password=sc.next();
		amnt=sc.nextDouble();
	}
	public void out4(){
		out1();
		out2();
		System.out.println("BANKNAME: "+bname+"Username: "+username+"password: "+password+"AMOUNT: "+amnt);
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		InterfaceExam2 e = new InterfaceExam2();
		e.in1();
		e.in2();
		System.out.println("Payment method Enter 1 for online, 2 for Netbanking");
		int a=sc.nextInt();

		switch(a){
			case 1:

				e.in3();
				e.out1();
				e.out2();
				e.out3();
				break;
			
			case 2:
			
				e.in4();
				e.out4();
				break;
		}
		
	}
}