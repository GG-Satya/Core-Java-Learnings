class C
{
static int i;
	public static void main (String[] args)
	{
	C c1=new C();
	C c2=new C();
	c1.i=10;
	System.out.println(c1.i);
	System.out.println(c1.i);
c1.i=20;
	System.out.println(c2.i);
	System.out.println(c2.i);
	}
}