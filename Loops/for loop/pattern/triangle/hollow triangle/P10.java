import java.util.Scanner;		// hollow triangle
class P10
{
	public static void main(String[] args)
	{
	System.out.println("Enter a number");
	Scanner scn=new Scanner(System.in);
	int n= scn.nextInt();
	int spaces = n-1 , stars= 1;
		for(int i=1;i<=n; i++) {
			for(int j=1; j<=spaces; j++) System.out.print(" ");
			for(int j=1; j<=stars; j++) {
				if(i==n || j==stars || j==1) System.out.print("*");
				else  System.out.print(" ");
			}
		System.out.println();
		spaces--;
		stars++;
		}
	}
}