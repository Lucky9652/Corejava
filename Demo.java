package Lesson5String;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Student s1=new Student();
		s1.setRno(1);
		s1.setName("karthik");
		s1.setPer(89);
		s1.setContactno("9629769652");
		System.out.println(s1);
		
		Student s2=new Student();
		s2.setRno(2);
		s2.setName("Nethra");
		s2.setPer(76);
		s2.setContactno("8925682521");
		System.out.println(s2);
		*/
		
		
		/*String s1="java";
		String s2="fullstack";
		String s3=s1+ "  " +s2;
		System.out.println(s1);//java
System.out.println(s2);//fullsatack
System.out.println(s3);//java    fullstack======space======   this is the output
	*/
		/*String s1="java";
		String s2="fullstack";
		String s3=s1+s2;
		System.out.println(s1);//java
System.out.println(s2);//fullsatack
System.out.println(s3);//javafullstack====int his there is no space
	*/
		
		/*String str1=new String("javaprogramming ");
		System.out.println("str1: "  + str1);
		System.out.println("index of p :" + str1.indexOf("p"));
		System.out.println("substring :" + str1.substring(5,12));
		System.out.println("valueof :" + str1.valueOf(5));
		System.out.println("concate  : " + str1.concat ("Training"));
		System.out.println("Length :" + str1.length());
		
		*/
		
		/*length(): length of string
		indexOf(): searches an occurrence of a char, or string within other string
		substring(): Retrieves substring from the object
		trim(): Removes spaces
		valueOf(): Converts data to string
		isEmpty(): Added in Java 6 to check whether string is empty or not
		concat(String s)*/ 
		
		String str1=new String("Java Programming");
		System.out.println("str1 is : "+str1);
		System.out.println("Length : "+str1.length());
		System.out.println("Index of P : "+str1.indexOf("P"));
		System.out.println("Substring : "+str1.substring(5));
		System.out.println("Substring : "+str1.substring(5,12));
		System.out.println("valueOf : "+str1.valueOf(5));
		System.out.println("Concate : "+str1.concat(" Training"));
		String ss="Hello";
		int n=ss.indexOf("l")+1;
		System.out.println(ss.indexOf("l",n));
		System.out.println("first occurrance of a in Java Programming :  "+str1.indexOf("a"));
		System.out.println("Last occurrance of a in Java Programming :  "+str1.lastIndexOf("a"));
		System.out.println(str1.charAt(5));
		str1="   String    ";
		System.out.println(str1+str1.length());
		System.out.println(str1.trim()+str1.trim().length());
		
		
	}

}
