class A
{
	static void m1()
	{
	System.out.println("m1() of A");
	}
}
class B extends A
{
	static void m1()
	{
	System.out.println("m1() of B");
	}
}
class C extends A
{
	static void m1()
	{
	System.out.println("m1() of C");
	}
}
class Test
{
	public static void main(String[] args)
	{
		A a1=new B();
		a1.m1();	// Earley Binding
		a1=new C();
		a1.m1();	// Earley Binding
	}
}