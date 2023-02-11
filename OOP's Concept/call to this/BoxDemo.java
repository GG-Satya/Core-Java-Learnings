class Box
{
	int height;
	int weight;
	int length;

	Box(int h, int w, int l) {
		height=h;
		weight=w;
		length=l;
	}

	Box(int d)
	{
		this(d,d,d);
	}

	void display(){
	System.out.println(height+" , "+weight+" , "+length);
	}
}

class Test1
	{
		public static void main(String[] args)
		{
		Box b1=new Box(5);
		b1.display();
		

		}
	}