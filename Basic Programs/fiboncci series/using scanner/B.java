import java.util.Scanner;
class B
{
	public static void main (String[] args)
	{
Scanner scn = new Scanner(System.in);
	int N = scn.nextInt();

	int n1=0,n2=1;
	int count=0;

	while(count<N)
	{
	System.out.println(n1);
	int n3=n1+n2;
	n1=n2;
	n2=n3;
	count+=1;

	}
	}

}