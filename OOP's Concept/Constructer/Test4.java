class B
{
	
}
class C
{
	C(int i){
	}
}
class Test4
{
	public static void main(String[] args)
	{
		new B();
		// new C(); // throws error : constructer C in class C can't be applied to given types
		new C(20); 
	}
}
