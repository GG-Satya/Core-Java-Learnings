import java.util.Scanner;
class P1
{
	public static void main(String[] args)
	{
	System.out.println("Enter a number");
	int n=new Scanner(System.in).nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++)
				System.out.print("*");	
		System.out.println();	                    //most imp line
		}
	
	}
}