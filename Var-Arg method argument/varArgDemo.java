import java.util.Scanner;		//sum using var-arg method
class varArgDemo
{
public static void main(String[] args)
	{
	System.out.println(m1(5));
	System.out.println(m1(1,2,3,4));
	System.out.println(m1(5,6,4,8,86));
	}
	static int m1(int...a)		// acts as an array to store values
	{
	int sum=0;
	for(int i=0; i<a.length; i++)
		sum+=a[i];			
		return sum;
	}
}