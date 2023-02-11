import java.util.Scanner;
class P3
{
	public static void main(String[] args)
	{
	System.out.println("Enter a number");
	int n=new Scanner(System.in).nextInt();
		for(int i=1;i<=n;i++) {
			
			if(i%2!=0) {
				int a=((i-1)*n)+1;			//remember this formula
				 for(int j=1;j<=n;j++) {
				 System.out.print(a+"\t");
				  a++;
				}
			}
			else { 
				int a=(i*n);				//remember this formula
					for(int j=1;j<=n;j++) {
					System.out.print(a+"\t");
					a--;
					}
				}	
		System.out.println();	                    //most imp line
		}
	
	}
}