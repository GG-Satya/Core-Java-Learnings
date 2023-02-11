class C
{	
	int i;
	C(int i) {
	 this.i=i;
	}
	
	void m1(A arg) {
	System.out.println(i);  // 20 (i refers to the non static var of object C)
	System.out.print(arg.i);  //10 (here arg.i refers to the non static var of object A)
	}
}

class Test2
{
	public static void main(String[] args)
	{
	A a1=new A(10);
	C c1=new C(20);
	c1.m1(a1);
	
	}
}