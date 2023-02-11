import java.util.Scanner;
class AM
{
	public static void main(String[] args)
	{
	System.out.println("Enter a number to check");
	int n=new Scanner(System.in).nextInt();
	int p=0,sum=0,temp=n;
		for(;n>0;n/=10) {
		p++;
		}
		n=temp;
			for(; n>0; n/=10) {
			int dig=n%10;
			int prod=1;
				for(int i=1; i<=p ;i++) {
				prod*=dig;
				}
			sum+=prod;
			}
	if(sum==temp)System.out.println("Yes, it is Armstrong number");
	else System.out.println("not a Armstrong number");
	}
}