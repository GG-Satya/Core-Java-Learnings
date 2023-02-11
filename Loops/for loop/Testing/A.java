import java.util.Scanner; 	 //HCF
class A
{
	public static void main (String[] args)
	{
		System.out.println("Enter two numbers");
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		int b=scn.nextInt();
		int n=a>b?b:a;
			for (;n>0;n--) {
			if(a%n==0 && b%n==0) break;
			} 
		System.out.println("HCF is "+n);
	}
}