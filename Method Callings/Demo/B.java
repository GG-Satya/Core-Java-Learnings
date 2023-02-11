class B
{
	public static void main(String[] args)
	{
	int i=0,j=0;
	j = m1(++i) + m1(i++);
	System.out.println(i+"..."+j); // 2...2
	}
	
	static int m1(int n) 
	{
	return n++;

	}
}