import java.util.Scanner;
class A
{ 
	public static void main(String[] args)
	{
	System.out.println("Enter the range");
	int n=new Scanner(System.in).nextInt();
	int count=0;
		for(int i=1;i<=n;i++){
			if(i<=1) continue;
			boolean flag=true;
			for(int j=2;j<=(i/2);j++) {
				if(i%j==0) {
				flag=false;
				break;
				}
			}
		if(flag) count++;
		}
	System.out.println("Total prime numbers  "+count);
	}


}