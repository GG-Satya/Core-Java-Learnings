class C
{
	int i;
	void initialize(int i)
	{
	this.i=i;
	}
}

class Test3
{
	public static void main(String[] args)
	{
	C c1=new C();
	c1.initialize(20);
	System.out.println(c1.i);
	}

}