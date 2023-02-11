import java.util.Scanner;
class G
{
	public static void main(String[] args)
	{
	System.out.println("Enter a number");
	int n=new Scanner(System.in).nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=n; j>=1; j--) {
				for (int k=1; k<=i; k++)
					System.out.print(j+" ");
			}
		System.out.println();
		}
	}

}