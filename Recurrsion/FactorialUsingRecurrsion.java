import java.util.Scanner;

class Factorial
{
	public static void main(String[] args)
	{
	System.out.println("Enter a Number");
	int n= new Scanner(System.in).nextInt();
	System.out.println(fact(n));
	}

	static int fact(int a)
	{
	if(a==0 || a==1) return 1;
	return a*fact(a-1);
	}
}