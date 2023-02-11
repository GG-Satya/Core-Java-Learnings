import java.util.Scanner;   
class P5
{
	public static void main(String[] args)
	{
	System.out.println("Enter a number");
	int n=new Scanner(System.in).nextInt();
		for(int i=1;i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if((i+j)<=(n+1))System.out.print("*"); 		//method 2->  if (i+j >n ) System.out.print(" "); else System.out.print("*");
					
			}
		System.out.println();
		}
	}
}

