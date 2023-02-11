import java.util.Scanner;
class A
{
	public static void main (String[] args)
	{
	System.out.println("enter a number number");
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	int sum=0;
	String s= "";
		for(int i=1;i<=n;i++) {
		sum+=i;
		s+=i;
		   if (i!=n) s+="+";
		
		}
	System.out.println(s+" = "+sum);
		
}


}