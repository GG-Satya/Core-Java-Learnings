import java.util.Scanner;
class A
{
	public static void main(String[] args)
	{
	System.out.println("Enter a year");
	int yr=new Scanner(System.in).nextInt();

		if(yr%400==0 || yr%4==0 && yr%100!=0)
		{
		System.out.println("it is a leap year");
		}
				else
				{
				System.out.println("it is not a leap year");
				}
	}
}