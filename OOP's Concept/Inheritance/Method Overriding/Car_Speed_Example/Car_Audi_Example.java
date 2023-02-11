class Car
{
	void move()
	{
		System.out.println("Car is moving at a speed of 50 km/ph");
	}
}

class Audi extends Car
{	
	
	void move(int speed)
	{
		System.out.println("Car is moving at a speed of "+speed+" km/ph");	
	}
}

class Test
{
	public static void main(String[] args)
	{
		Audi a=new Audi();
		a.move();
		a.move(120);
	}
}