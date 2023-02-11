class A
{
	int i=5;
}

class B extends A
{
	int i=15;
	void m1() {

		System.out.println(i);

		System.out.println(super.i);
		}
}

class Test
{
	public static void main(String[] args)
	{
	B b1=new B();
	b1.m1();
	}
}