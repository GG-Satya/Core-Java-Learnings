import java.util.Scanner;
class A
{
	public static void main(String[] args)
	{
	System.out.println("Enter a number");
	int n=new Scanner(System.in).nextInt();
	int space= n-1, star= 1	;
		for(int i=1; i<=n; i++){
			for(int j=1; j<=space; j++)System.out.print(" ");
			for(int j=1; j<=star; j++) {
				if(j==1 || j==star || i==n )	System.out.print("*");
				else System.out.print(" ");
				}
		
		System.out.println();
		space--; star+=2;
		}

	}

}