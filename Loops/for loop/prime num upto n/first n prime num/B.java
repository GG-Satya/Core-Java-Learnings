import java.util.Scanner;
class B
{
	public static void main (String[] args)
	{
		System.out.println("enter how many prime numbers you want");
		int n=new Scanner(System.in).nextInt();
		int count=0;
	 		for(int i=2;count<n;i++) {
			 	boolean flag=true;
			 	for(int j=2;j<=(i/2);j++){
			 	if(i%j==0) { flag=false; break; }
				}
		if(flag){ count++; System.out.println(count+" --> "+i); }
		}
	}
}