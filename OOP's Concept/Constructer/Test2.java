class Rectangle
{
	int length;
	int breadth;
	
	Rectangle(int length, int breadth)
	{
	this.length=length;
	this.breadth=breadth;
	}
	
}

class Test2
{
	public static void main(String[] args)
	{
	Rectangle r1=new Rectangle(10,20);
	System.out.println(r1.length+".."+r1.breadth);
	
	}
}