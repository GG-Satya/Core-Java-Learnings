import java.util.Scanner;
class A
{ 
	public static void main (String[] args)
	{
	System.out.println("enter a num to check");	
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	boolean flag=true;
	if (n<=1) { System.out.println("Not a prime number"); return; }
	   
	 for(int i=2;i<=(n/2);i+=i) {
		if(n%i==0){flag= false;break;} 
		}
	if(flag) System.out.println("yes, it is a prime number");
	else 	 System.out.println("Not a prime number");
	}

}