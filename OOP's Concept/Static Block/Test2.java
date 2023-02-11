class B
{
	static
	{
		System.out.println("Static Block Executing");
	}
	
	static void m1()
	{
		System.out.println("m1() Executing");
	}
}

class Test2
{
	public static void main(String[] args)
	{
		System.out.println("main() Starts");
		B.m1();
		B.m1();
		System.out.println("main() Ends");
	}	
}

/* static block of a class is executed only once at the time of class loading, at when that
	class introduced 1st time in code. */