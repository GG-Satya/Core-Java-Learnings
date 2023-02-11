class Car
{
	void start()
	{
		System.out.println("start() in Car");
	}
}
class Audi extends Car
{
	void start()
	{
		System.out.println("start() in Audi");
	} 
}
class Benz extends Car
{
	void start()
	{
		System.out.println("start() in Benz");
	}
}
class Test
{
	public static void main(String[] args)
	{
		Car c1=new Audi();
		Car c2=new Benz();
		c1.start();
		c2.start();
	}
}