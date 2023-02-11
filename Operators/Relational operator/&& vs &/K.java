class K
{
	public static void main(String[] args)
	{
	int a=5;
	int b=6;
	System.out.println(a++>5 && ++b>6);//false , 2nd epression ignored
	System.out.println(a+"..."+b);  // 6..6

	System.out.println(a++>6 & ++b>6); //both expression executed
	System.out.println(a+"..."+b);  // 7...7
	}
}