class Box				//constucter overloading is possile
{
	int height;
	int weight;
	int length;

	Box(int h,int w,int l)
	{
	height=h;
	weight=w;
	length=l;
	}
	
	Box(int n) {			
	height=weight=length=n;
	}

	void display(){
	System.out.println("height ="+height+" , "+"weight = "+weight+" , "+"length = "+length);
	}
}

class Test5
{
	public static void main(String[] args)
	{
	Box b1=new Box(3,4,5); // we can create box with any dimendsion
	Box b2=new Box(4);     // we can create cube 
	
	b1.display();		// we can create object as per our requirement
	b2.display();
	}
}