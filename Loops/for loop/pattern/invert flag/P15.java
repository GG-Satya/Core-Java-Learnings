import java.util.Scanner;
class P15
{
	public static void main(String[] args)
	{
		System.out.println("Enter a number");
		int n=new Scanner(System.in).nextInt();

	
			for(int i=1; i<=(n*2)-1 ; i++) {
				for(int j=1;j<=n;j++) 
							if (j<=n-i)	System.out.print(" "); 
							else	 System.out.print("*");
				//for(int j=4;jn;j--) 
								System.out.print(" ");
								// System.out.print("*");
		 System.out.println();
			}
	}
}
	