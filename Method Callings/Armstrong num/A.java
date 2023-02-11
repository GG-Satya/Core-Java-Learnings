import java.util.Scanner;
class A
{
	public static void main(String[] args)
	{
	System.out.println("Enter a number to check");
	int n=new Scanner(System.in).nextInt();
	if(check(n))System.out.println("Yes, Armstrong number");
	else System.out.println("Not a armstrong number");
	}

	static boolean check(int n)
		{
		int p=len(n);
		int temp=n;
		int sum=0;
			while(n>0) {
			sum+=pow(n%10, p);
			n/=10;
			}
		return temp==sum;
		}

	static int len(int n)
		{
		int i=0;
		for(;n>0;n/=10)
		i++;
	 	return i;
		}
	static int pow(int d, int p)
		{
		int prod=1;
		for(int i=1; i<=p; i++) prod*=d;
		return prod;
		}

}
