class A
{
	A(){
	System.out.println("Constructer"); //each time ececuted when a new object is created
	}
}
class Test1
{
	public static void main(String[] args)
	{
	new A(); //object is created
	new A(); // a new object is created
	}
}