class A
{
	A() {
		super();   // optional--- it calls the object class constucter
		System.out.println("constructer A");
	}

}

class B extends A
{
	B() {
		super();  // optional ---- it calls its Immidiate sueperclass constructer 
		System.out.println("constructer B");
	}

}

class C extends B
{
	C() {
		super();	// optional ---- it calls its Immidiate sueperclass constructer 
		System.out.println("constructer C");
	}

}


class Test extends B
{
	public static void main(String[] args)
	{
		new C();	
	}
}