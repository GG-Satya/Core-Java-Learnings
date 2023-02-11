import java.util.Scanner; 	 //palindrome num check
class A
{
	public static void main (String[] args)
	{
		System.out.println("Enter a num to check");
		int n=new Scanner(System.in).nextInt();
		int temp=n,rev=0;

			for(;n>0;n/=10) {
			rev= (rev*10)+(n%10);
			
		}
	if (temp==rev) System.out.println("yes, it is a Palindrome num");	
	else System.out.println("Not a Palindrome num");	
	}
}