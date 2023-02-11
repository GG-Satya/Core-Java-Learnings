class D
{
	int i;
	D() {
		i=10;	
	}
}

class E extends D
{
	int j;
	E() {
		j=20;	
	}
}

class Test1 extends E
{
	public static void main(String[] args)
	{
	E e1=new E();
	System.out.println(e1.i);
	System.out.println(e1.j);
	}
}
