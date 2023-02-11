import java.util.Scanner; 	 //fibonacci series 
class A
{
	public static void main (String[] args)
	{
		System.out.println("How many numbers you want to print in fibonacci series");
		int n=new Scanner(System.in).nextInt();
		int a=0,b=1,c;
			for(int i=0;i<=n;++i) {
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
		
	}
}