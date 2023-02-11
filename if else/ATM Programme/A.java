import java.util.Scanner;

class A

{
	public static void main(String[] args)
	{
	System.out.println("Please enter the amount");
	int x=new Scanner(System.in).nextInt();
	if(x%100!=0)
		{
		System.out.println("FAIL : Amount should be multiple of 100");
		return;
		}
	 if(x>2000)
		{
		System.out.println("2000 X "+ x/2000);
		x=x%2000;
		}
	if(x>500)
		{
		System.out.println("500 X "+ x/500);
		x%=500;
		}
	if(x>200)
		{
		System.out.println("200 X "+ x/200);
		x%=200;
		}
	if(x>100)
		{
		System.out.println("100 X "+ x/100);
		}
	}
}
