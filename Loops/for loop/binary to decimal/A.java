import java.util.Scanner; 	 //binary to decimal
class A
{
	public static void main (String[] args)
	{
		System.out.println("enter a binary number");
		int n=new Scanner(System.in).nextInt();
		int dec=0;
		for(int i=1;n>0;n/=10) {
			dec+=(n%2)*i;
			i*=2;
		}
		System.out.println("decimal no is "+dec);
	}
}