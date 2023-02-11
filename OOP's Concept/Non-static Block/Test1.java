class B
{
	{
		System.out.println("non-static block executing");  // non-static block
	}

	B()
	{
		System.out.println("constructer executing");
	}

	B(int i)
	{
		System.out.println("parametrised constructer executing");
	}
}

class Test1
{
	public static void main(String[] args)
	{
		System.out.println("main() executing");
		new B();
		new B(10);
	}
}