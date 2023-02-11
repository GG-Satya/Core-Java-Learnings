class A
{
	public static void main(String[] args)
	{
	int n=10;
	m1(n);
	System.out.println("Int main, n= "+n); // 10 
	}
	
	static void m1(int n) 
	{
	n*=2;
	System.out.println("int m1, n= "+n); //20 

	}
}