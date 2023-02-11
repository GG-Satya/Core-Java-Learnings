import java.util.Scanner;
class A
{
	public static void main (String[] args)
	{
	System.out.println("enter a number number");
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
      int a=0,b=0;
	    for(int rem=0;n>0;n/=10) {
		rem=n%10;
			if (rem%2==0) a+=rem;
		if (rem%2!=0) b+=rem;
		}
	System.out.println(a+" even digits");
	System.out.println(b+" odd digits");
	}
}