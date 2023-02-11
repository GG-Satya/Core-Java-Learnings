import java.util.Scanner;
class Happy 
{
	public static void main(String[] args) 
	{
		System.out.println("ENter a Number");
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		if(n <= 0){	System.out.println("ERROR : Enter Only Natural numbers");
					return;
					}
		isHappy(n);
	}
	private static void isHappy(int i)
	{
		if(i==1){System.out.println("Yess, Happy Number");}

		else if(i==4){System.out.println("Not a Happy Number");}

		else {isHappy(digitSqr(i));}
	}
	private	static int digitSqr(int n)
		{	
			System.out.println(n);
			int sum=0;	
			while(n>0)
			{
				sum+=(n%10)*(n%10);
				n/=10;
			}
			return sum;	
		}
	}