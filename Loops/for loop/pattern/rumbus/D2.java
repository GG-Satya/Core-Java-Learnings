import java.util.Scanner;
class D2
{
	public static void main(String[] args)
	{
	System.out.println("Enter a odd number");
	int n=new Scanner(System.in).nextInt();
	int space= n/2, star= 1	;
		for(int i=1; i<=n; i++){
			for(int j=1; j<=space; j++)System.out.print(" ");
				for(int j=1; j<=star; j++){
					if(j==1 || j==star || j==((star/2)+1) || i==((n/2)+1)) System.out.print("*");
					else	System.out.print(" ");
					}
				
				
		System.out.println();
		if(i<=n/2) {space--; star+=2;}
			else {space++; star-=2;}
		}

	}

}