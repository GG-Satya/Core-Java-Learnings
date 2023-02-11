import java.util.Scanner;
class A
{
	public static void main (String[] args)
	{
	System.out.println("enter two numbers");
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	int sum=0;
	String s="";
		for(int rem=0;n>0;n/=10) {
		rem=n%10;
		sum+=rem;
		s=rem+s;
		if(n>9)s=" + "+s;
		}
	System.out.println(s+" = "+sum);
	}
}