class Rectangle
{
	int length;
	int breadth;

		int getArea() {
		return length*breadth;
		}
		int getPerimeter() {
		return 2*(length+breadth);
		}

		void displayDimensions() {
		System.out.println("length = "+length+", breadth"+breadth);
		}


}

class Test
{
	public static void main(String[] args)
	{
	Rectangle r1=new Rectangle();
	r1.length=10;
	r1.breadth=20;
	r1.displayDimensions();
	System.out.println("Area = "+r1.getArea());
	System.out.println("perimeter = "+r1.getPerimeter());
	
	}

}