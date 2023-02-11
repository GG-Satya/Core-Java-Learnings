class A
{
static int i=1;
	public static void main(String[] args)
	{
	A.m1();
	A.i=10;
	A.m1();
	}
	public static void m1()
	{
	System.out.println("m1 starts");
	System.out.println(A.i);
	System.out.println("m1 ends");
	}
	
	
}