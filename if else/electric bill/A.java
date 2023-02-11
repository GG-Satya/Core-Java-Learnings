import java.util.Scanner;
class A
{
	public static void main(String[] args)
	{
	System.out.println("Enter the number of units");
	int x=new Scanner(System.in).nextInt();
		if(x<50)
		{
		System.out.println("No charges applicable");
		return;
		}
		  		if(x>50 && x<=100)
		  		{
		 		 x=x-50;
		 		 System.out.println("Total amount to pay = "+(x*3));
				 return;
		 	 	}
		    					 if(x>100 && x<=150)
		    					 {
		    					 x = x-100;
		    					 System.out.println("Total amount to pay = "+((50*3)+(x*5)));
							 return;
		     					}
		         							 if(x>150 && x<=200)
		         							 {
		          							 x=x-150;
		          							 System.out.println("Total amount to pay = "+((50*3)+(50*5)+(x*7)));
										 return;
		                                                 }
		          		                                            if(x>200)
					                                             {
					                                             x=x-200;
					                                             System.out.println("Total amount to pay = "+((50*3)+(50*5)+(50*7)+(x*12)));
												   return;
					                                             }
		
	}
}