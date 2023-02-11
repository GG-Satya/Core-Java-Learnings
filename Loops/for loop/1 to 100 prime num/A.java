class A
{
	public static void main (String[] args)
	{
		 for(int i=1;i<=100;i++) {
		      if(i<=1)continue;
					boolean flag=true;
					for(int j=2;j<=i/2;j+=j) {
					if(i%j==0) { flag=false; break;}
			}
		if (flag)System.out.println(i);
		}
	
	}
}