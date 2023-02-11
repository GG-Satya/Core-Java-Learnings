class C
{
	 int x=10;
static int y=20;

	public static void main(String[] args)
	{
	C c1=new C();

	c1.x=888;
	c1.y=999;
	
	C c2=new C();
	
	System.out.println(c2.x+"...."+c2.y);
	}
}