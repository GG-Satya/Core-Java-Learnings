import java.util.Scanner;
class A
{
	public static void main(String[] args)
	{
	System.out.println("Enter a number to check");
	int n=new Scanner(System.in).nextInt();
	int sum=0,temp=n;
		for(; n>0; n/=10) {
		int rem=n%10;
		int fact=1;
			for(; rem>0;rem--) {
			fact*=rem;
			}
		sum+=fact;
		}
	if(sum==temp)System.out.println("Yes, it is a strong number");
	else System.out.println("Not a strong number");
	}
}