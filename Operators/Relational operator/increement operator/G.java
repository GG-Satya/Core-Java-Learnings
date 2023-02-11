class G
{
	public static void main(String[] args)
	{
int a=0;
	System.out.println(a++);//0
int b=a+++a;
	System.out.println(b);//3
b=++a + a++ + ++a;
	System.out.println(a++);//5
 a=0;
a=++a;
	System.out.println(a);//1
 a=0;
a=a++;
	System.out.println(a);//0

	}
}