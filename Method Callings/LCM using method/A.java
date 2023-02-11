import java.util.Scanner;	//LCM using method calling
class A
{
	public static void main(String[] args)
	{
	System.out.println("Enter two numbers");
	Scanner scn=new Scanner(System.in);
 	int a=scn.nextInt();
	int b=scn.nextInt();
	System.out.println("LCM is "+m1(a,b));
	}

	static int m1(int a, int b)
	{
	int n=a>b?a:b;
	for(int i=n; true; i++)
		if(i%a==0 && i%b==0) return i;
	}

}