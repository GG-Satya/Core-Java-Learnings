class A
{
	int i=1;
}
class B extends A
{
	int i=2;
}
class C extends A
{
	int i=3;
}
class Test1
{
	public static void main(String[] args)
	{
		A a1=new B();
		System.out.println(a1.i);   // Earley Binding
		A a2=new C();
		System.out.println(a2.i);	// Earley Binding	
	}
}

/* all type variables, static methods, final methods, private methods are binded by compiler
at compile time. this is called as Earley Binding */