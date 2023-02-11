import java.util.Scanner; 	 //decimal to binary
class A
{
	public static void main (String[] args)
	{
		System.out.println("enter a number");
		int n=new Scanner(System.in).nextInt();
		int bin=0;
		for(int i=1;n>0;n/=2) {
			bin+=(n%2)*i;
			i*=10;
		}
		System.out.println("binary representation "+bin);
	}
}