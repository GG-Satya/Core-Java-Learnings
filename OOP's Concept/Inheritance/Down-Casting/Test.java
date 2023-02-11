class A
{
	void m1()
	{
		System.out.println("m1() in A");	
	}
}
class B extends A
{
	void m2()
	{
		System.out.println("m2() in B");
	}
}
class C extends A
{
	void m3()
	{
		System.out.println("m3() in C");
	}
}
class Test
{
	public static void main(String[] args)
	{
		A a1=new B();
		a1.m1();
		// a1.m2(); --> Compile time error
		B b1=(B)a1;    // Down-Casting
		b1.m2();

		A a2=new C();
		((C)a2).m3();	 // Down-Casting
	}
}

/*By using super-class reference we can't access the subclass properties, so that we go for
downcasting, in which we explicitly coverts the super class reference into a sub-class type*/