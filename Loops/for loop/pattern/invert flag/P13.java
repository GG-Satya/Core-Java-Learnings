import java.util.Scanner;
class P13
{
	public static void main(String[] args)
	{
		System.out.println("Enter a number");
		int n=new Scanner(System.in).nextInt();

		
			for(int i=1; i<=(2*n)-1; i++) {
	
			if(i<=n){
					for(int j=1; j<=n; j++){
					if((i+j)>=(n+1)) System.out.print("*");		
					else  System.out.print(" ");	
					}
				}
			else {
					for(int j=1; j<=n; j++){
					if((i-j)<=(n-1)) System.out.print("*");		
					else  System.out.print(" ");	
					}
				}				
			
			System.out.println();
			}

	}

}