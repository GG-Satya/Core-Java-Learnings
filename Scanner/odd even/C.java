import java.util.Scanner;
class C
{
	public static void main (String[] args)
	{
int x=new Scanner(System.in).nextInt();  // we can also declare object like this if there is only one input is required

System.out.println(x%2==0?"it is a even number":"it is an odd number");  //using ternary operator
	}
}

class D
{
	public static void main (String[] args)
	{
int x=new Scanner(System.in).nextInt();
	if(x%2==0)										//using if else statement
	{
System.out.println("even number");
	}else
{
System.out.println("odd number");}
	}
}