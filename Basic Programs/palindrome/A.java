import java.util.Scanner;
class A
{
    public static void main (String[] args)
    {
    System.out.println("enter a number");
    int x=new Scanner(System.in).nextInt();
	int temp =x;
	int rev =0;
      int rem =0;
		
		while(temp!=0) {
		rem=temp%10;
		rev=(rev*10)+rem;
		temp/=10;
		}

		if(x==rev) {
       	System.out.println(x+" is a palindrome number");	
		} else {
	 	System.out.println(x+" is not a palindrome number");
		}
		
	}
}