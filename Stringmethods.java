

public class Stringmethods{
	public static void main(String[] args) {
		String s=new String("Computor");
		String s3=new String("coMpUtoR");
		System.out.println(s);
		String s2=s.toLowerCase();

		System.out.println(s2.toUpperCase());
		System.out.println(s.indexOf("ut",3));
		System.out.println(s.indexOf("uto",5));
		System.out.println(s.indexOf('o',4));

		System.out.println(s.lastIndexOf('O'));
		System.out.println(s.lastIndexOf("uto",6));

		if(s.equalsIgnoreCase(s3))
			System.out.println("Same");
		else
			System.out.println("not same");
		String s4="computor";
		System.out.println(s.compareTo(s4));

		System.out.println(s.substring(3));
	}
}