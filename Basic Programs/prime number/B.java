import java.util.Scanner;
class B
{
    public static void main (String[] args)
    {
	int count=0;
    System.out.println("enter a number");
    int x=new Scanner(System.in).nextInt();
        for(int i=1;x>=i;++i) {
	      if(x%i==0) {
		++count;
		}
	  }   
				
	  if(count==2) {
             System.out.println(x+" is a prime number");
	  } else {
		System.out.println(x+" is a not a prime number");
	  }
		
		
	  
	  
    }
}