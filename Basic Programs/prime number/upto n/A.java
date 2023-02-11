import java.util.Scanner;
class A
{ 
 public static void main (String[] args)
  {
	System.out.println("enter the range of prime numbers");
	int n=new Scanner(System.in).nextInt();

  		for(int i=1,j,count=0;i<=n;i++) {
			for(j=1;j<=i;j++) {
			if (j%i==0) count++;
			}
	if (count==2)System.out.println(j);	
		}
  }
		
}