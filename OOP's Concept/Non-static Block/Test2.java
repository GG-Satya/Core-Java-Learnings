class C
{
	{
		System.out.println("non-static block executing");  // non-static block
	}

	static
	{
		System.out.println("static block executing");  // static block
	}

	C()
	{
		System.out.println("default constructer executing");
	}
}

class Test2
{
	public static void main(String[] args)
	{
		System.out.println("main() executing");
		new C();
		new C();
	}
}