class A
{
	{
		System.out.println("non-static block executing");
	}

	A()
	{
		System.out.println("constructer executing");
	}
}

class Test
{
	public static void main(String[] args)
	{
		System.out.println("main() executing");
		new A();
		new A();
	}
}

/* non-static block executed each time a new object is created.
	--> java compiler autoamtically puts the non-static block codes into each constructer 
		of that class by serially from 1st line  */