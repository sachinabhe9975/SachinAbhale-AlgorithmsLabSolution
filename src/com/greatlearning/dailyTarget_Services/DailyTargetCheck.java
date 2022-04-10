package com.greatlearning.dailyTarget_Services;




public class DailyTargetCheck 
{
	 public void checkTarget(int valueOfTarget, int transactionArray[], int size) 
	 { 
		 int i;
		 int sum=0;
		 int count = 1;
		 for(i=0;i<size;i++)
		 { 
			 sum=sum+transactionArray[i];
			 if(sum>=valueOfTarget)
			 {
				 count=count+i;	 
				 System.out.println("Target achieved after "+count+" transactions");
				 return;
			 } 
			
		 }
		 if(i==size)
		 {
		   System.out.println("Given target is not achieved");
		 }
	
	
}
}