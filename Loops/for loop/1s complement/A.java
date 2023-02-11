import java.util.Scanner;
class A
{
	public static void main (String[] args)
	{
	System.out.println("enter a numbers");
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
		int bin=0;
	    for(int rem=0,i=1;n>0;i*=10) {
	    rem=n%2;
	      if(rem==0)rem=1;
	      else rem=0;
	    bin=(rem*i)+bin;
	    n/=2;
	    }
	System.out.println(bin);
	}
}