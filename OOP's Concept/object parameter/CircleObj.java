class Circle
{
	int radius;
	
	Circle(int i) {
	radius=i;
	}
	
	void display(Circle c) {
	System.out.println(radius);
	System.out.println(c.radius);
	}

}

class Test5
{
	public static void main(String[] args)
	{
	Circle c1=new Circle(10);
	Circle c2=new Circle(20);
	c1.display(c2);
	c2.display(c1);
	c2.display(c2);
	c2.display(new Circle(30));
	
	}

}