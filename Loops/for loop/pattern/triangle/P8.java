import java.util.Scanner;
class P8
{
	public static void main(String[] args)
	{
	System.out.println("Enter a number");
	Scanner scn=new Scanner(System.in);
	int n= scn.nextInt();
		for(int i=1;i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i+j > n) System.out.print("*");
				else System.out.print(" ");
			}
		System.out.println();
		}
	}
}