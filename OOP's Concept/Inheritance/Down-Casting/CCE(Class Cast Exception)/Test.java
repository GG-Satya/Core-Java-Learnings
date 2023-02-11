class A			
{
}
class B extends A
{
}
class C extends A
{
}
class Test
{
	public static void main(String[] args)
	{
		A a1=new B();
		B b1=(B)a1;
		C c1=(C)a1;		// ClassCastException
	}
}
/*The Above programme will compile fine, but at run time it will through an Exception
 known as ClassCastException*/