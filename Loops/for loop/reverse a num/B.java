import java.util.Scanner;
class B
{
	public static void main (String[] args)
	{
	System.out.println("enter a num to reverse");
	int n=new Scanner(System.in).nextInt();
	int rev=0;
		for (;n>0;n/=10) {
		rev=(rev*10)+(n%10);
		}
System.out.println("reverse num is "+rev);
	}
}