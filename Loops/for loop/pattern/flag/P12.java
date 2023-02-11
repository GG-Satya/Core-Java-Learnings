import java.util.Scanner;		// flag
class P12
{
	public static void main(String[] args)
	{
	System.out.println("Enter a number");
	Scanner scn=new Scanner(System.in);
	int n= scn.nextInt();
		for (int i=1; i<=(n*2)-1; i++) {
			for(int j=1; j<=i; j++) {
				if((i+j) > (n*2)) break;
				 System.out.print("*");
			}
		System.out.println();	
		}
	}
}