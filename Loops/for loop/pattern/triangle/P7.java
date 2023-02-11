import java.util.Scanner;
class P7
{
	public static void main(String[] args)
	{
	System.out.println("Enter a number");
	int n=new Scanner(System.in).nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=n;j>=1;j--) {
			if(j>=i){
			 	System.out.print(j);
				if(j!=i) System.out.print("*");}
			}
		System.out.println();
		}
	}
}