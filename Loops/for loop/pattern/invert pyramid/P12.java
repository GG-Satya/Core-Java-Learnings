import java.util.Scanner;		// invert pyramid
class P12
{
	public static void main(String[] args)
	{
	System.out.println("Enter a number");
	Scanner scn=new Scanner(System.in);
	int n= scn.nextInt();
	int spaces = 0 , stars= (n*2)-1;
		for(int i=1;i<=n; i++) {
			for(int j=1; j<=spaces; j++) System.out.print(" ");
			for(int j=1; j<=stars; j++) {
				System.out.print("*");
			}
		System.out.println();
		spaces++;
		stars-=2;
		}
	}
}