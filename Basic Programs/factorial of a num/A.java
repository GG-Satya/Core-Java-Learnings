import java.util.Scanner;
class A
{
   	 public static void main (String[] args)
    	{
    System.out.println("enter a number");
    int x=new Scanner(System.in).nextInt();
	int fact=1;
	
		for(;x>0;x--) {
		fact=fact*x;
		
		}
	 System.out.println("factorial of this number is "+fact);
	}
}