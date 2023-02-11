class A
{
	A() {
		System.out.println("constructer A");
	}

}

class B extends A
{
	B() {
		System.out.println("constructer B");
	}

}

class C extends B
{
	C() {
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