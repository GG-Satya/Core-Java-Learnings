class Armstrong
{
	public static void main(String[] args)
	{
	int n=Integer.parseInt(args[0]);
	if(isArmstrong(n))  System.out.println("Yes, Armstrong  Number");
	else  System.out.println("Not a Armstrong  Number");
	}
	static boolean isArmstrong(int n)
	{
	
		int temp=n;
		int pow= len(n);
		int sum=0;
		for(;n>0;n/=10) {
			int d=n%10;
			sum+= pow( d, pow);
		}
	return (sum==temp);
	}

	static int len(int n)
	{
		int count=0;
		while(n>0) {
		n=n/10;
		count++;
		}
	return count;
	}

	static int pow(int d, int pow)
	{	
	int prod=1;
		for(int i=1; i<=pow; i++)
		{	
		prod*=d;
		}
	return prod;
	}
	
}