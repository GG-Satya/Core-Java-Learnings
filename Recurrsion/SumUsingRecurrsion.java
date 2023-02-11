class Sum
{
	public static void main(String[] args)
	{
	System.out.println(add(4));
	}

	static int add(int a)
	{
	if (a==0) return 0;
	return a+add(a-1);
	}
}