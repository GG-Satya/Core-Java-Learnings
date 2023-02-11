class A
{
	A(int i) {
		System.out.println("parametrise constructer of A");
	}
}

class B extends A
{
	B() {
		super(10);  // mandatory
		System.out.println("Default constructer of B");
	}
}

class Test2 extends B
{
	public static void main(String[] args)
	{
		System.out.println("Hello world");	
	}
	
}

/*if super class constructer has no default constructer & contains parametrise constructer only,
then we need to write the call to super() statement with appropriate arguments inside the
subclass constructer*/