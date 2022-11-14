
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c[] = {'j','a','v','a'};
		String s1=new String(c);
		String s2=new String(s1);
		System.out.println(c);
		System.out.println(s1);
String longStr=(",,,,,,,,,        "      +s1 );
System.out.println(longStr);
	}

}
