import java.util.Scanner;
class A
{
	public static void main (String[] args)
	{
	System.out.println("enter a numbers");
	Scanner scn=new Scanner(System.in);
	   int n=scn.nextInt();
		int sum=0;
		for(int i=1;i<=(n/2);i++) {
		 if(n%i==0) sum+=i;
	}
	if(n==sum)System.out.println("yes, perfect number");
	else System.out.println("not a perfect number");		
	}
}