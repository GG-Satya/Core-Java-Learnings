class Phone
{
	int height;
	int width;
	int length;

	Phone(int h, int w, int l)
	{
		height=h;
		width=w;
		length=l;
	}

	void display()
	{
		System.out.println("height= "+height);
		System.out.println("width= "+width);
		System.out.println("length= "+length);
	}
}
class Smartphone extends Phone
{
	int pixel;

	Smartphone(int h,int w,int l,int p)
	{
		super(h,w,l);
		pixel=p;
	}

	void display()
	{
		System.out.println("pixel= "+pixel);
		super.display();
	}
}
class Test1
{
	public static void main(String[] args)
	{
	Smartphone s=new Smartphone(5,3,2,10);
	s.display();
	}
}