import java.util.Scanner;
class A
{
	public static void main (String[] args)
	{
	System.out.println("enter two numbers");
	Scanner scn=new Scanner(System.in);
	int a=scn.nextInt();
	int b=scn.nextInt();
	int hcf=0;
	
	for(int i=1;true;i++) {
	    if (a%i==0 && b%i==0) hcf=i;
		if (i==a || i==b) break;
		
	   }
	System.out.println("HCF is "+hcf);
	}
}