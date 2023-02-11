class Car
{
}
class Audi extends Car
{
}
class Benz extends Car
{
}
class Driver
{
	void drive(Car c)
	{
		System.out.println("drive method is executing");
	}
}
class Test
{
	public static void main(String[] args)
	{
	Driver d=new Driver();
	d.drive(new Audi());
	d.drive(new Benz());
	}
}

/* Assigning sub-class instances to super-class reference variable is called as Up-casting */