class Rectangle
{
	int length;
	int breadth;

	Rectangle(int l, int b) {
	this.length=l;
	this.breadth=b;
	}
		
	Rectangle(Rectangle args)    // copying value from r1 to r2
	{
		length=args.length;
		breadth=args.breadth;
	}

}

class Test1
{
	public static void main(String[] args)
	{
		Rectangle r1=new Rectangle(10,20);
		Rectangle r2=new Rectangle(r1);		// giving input to copy value
		System.out.println(r2.length+" ,  "+r2.breadth);  
	}
}