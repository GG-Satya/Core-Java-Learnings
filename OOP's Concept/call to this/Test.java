class A
{
	A(){
	System.out.println("A() is executing");
	}

	A(int a){
	this();
	System.out.println("A(int i) is Executing");
	}

}

class Test
{
	public static void main(String[] args)
	{
	new A(5);
	
	}
}
