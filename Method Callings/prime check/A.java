import java.util.Scanner;	//Prime check using method calling
class A
{
	public static void main(String[] args)
	{
	System.out.println("Enter two numbers");
	Scanner scn=new Scanner(System.in);
 	int n=scn.nextInt();
	if(m1(n))System.out.println("Yes it is a Prime number");
	else System.out.println("Not a Prime number");
	}

	static boolean m1(int n)
	{
		if(n<=1) return false;
	
		for(int i=2;i<=n/2; i++) {
			if(n%i==0) return false;
		}
		return true;
	}

}