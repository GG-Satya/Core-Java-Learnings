import java.util.Scanner;

class A

{
	public static void main(String[] args)
	{
	System.out.println("hey rascal enter the string");
	Scanner scn=new Scanner(System.in);
	
	String s1=scn.next(); //scan upto space
	String s2=scn.nextLine(); //scan upto line end or enter

System.out.println("s1="+s1);
System.out.println("s2="+s2);
	}
}