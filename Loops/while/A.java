import java.util.Scanner;
class A
{
	public static void main(String[] args)
	{
	System.out.println("enter a number");
	int x=new Scanner(System.in).nextInt();
		int i=1,j=0;
		while(i<11) {
		j=x*i;
		System.out.println(x+" X "+i+" = "+j);
		++i;
		}
	}
}