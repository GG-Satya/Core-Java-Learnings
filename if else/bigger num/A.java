import java.util.Scanner;

class A

{
	public static void main(String[] args)
	{
	Scanner x=new Scanner(System.in);
	int a = x.nextInt();
	int b = x.nextInt();
	if(a>b)
		{ 
		System.out.println(a+" is bigger");
		}
	else if(a<b)
		{
		System.out.println(b+" is bigger");
		}
				
	else
		{ 
		System.out.println("both numbers are same");
		}
	}
}

