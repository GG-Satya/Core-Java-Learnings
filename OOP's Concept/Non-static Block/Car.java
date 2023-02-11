class Car
{
	int num;
	String color;
	private static int n=1000;

	{
		num=n++;  // non-static block
	}

	Car(String c)
	{
		color=c;  
	}

	Car()
	{
		color="white";
	}
}

class Test2
{
	public static void main(String[] args)
	{
		
		Car c1=new Car();
		Car c2=new Car("Red");
		System.out.println(c1.num+" , "+c1.color);
		System.out.println(c2.num+" , "+c2.color);
	}
}