import java.util.Scanner;    //hollow box
class P4
{
	public static void main(String[] args)
	{
	System.out.println("Enter a number");
	int n=new Scanner(System.in).nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
			if(i==1 || i==n || j==1 || j==n) System.out.print("*");
			else 	System.out.print(" ");
			}
		System.out.println();					// most imp line
		}
	}
}
		