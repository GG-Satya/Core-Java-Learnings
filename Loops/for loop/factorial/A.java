import java.util.Scanner;
class A
{
	public static void main (String[] args)
	{
	System.out.println("enter a number number");
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	long fact=1;
	String s="";
	    for(int i=1;i<=n;i++) {
		fact*=i;
		s+=i;
		if (i!=n) s+=" X ";
		}
	System.out.println(s+" = "+fact);	

	}
}