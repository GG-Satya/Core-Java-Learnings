import java.util.Scanner;
class A
{
	public static void main (String[] args)
	{
	System.out.println("enter a numbers");
	Scanner scn=new Scanner(System.in);
	int a=scn.nextInt();
	int m=1;
		for(int i=1;i<11;i++) {
		m=a*i;
		System.out.println(a+" X "+i+" = "+m);
		}
	}
}
		