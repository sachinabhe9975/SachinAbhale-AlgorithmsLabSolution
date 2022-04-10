package com.greatlearning.currencyDenominations_Model;

public class MinNotesApproach {
	
	public static void minNotesApproach(int[] currencyDenominationsValue,int amount)
	{
		
	      
		   int[] size =new int[ currencyDenominationsValue.length];
		   for(int i=0;i<currencyDenominationsValue.length;i++)
		   {
			   if(amount >=currencyDenominationsValue[i])
			   {
				   size[i]= amount / currencyDenominationsValue[i];
				   amount =amount -(size[i] * currencyDenominationsValue[i]);
				   		
			   }
			   
			   else if(amount <=currencyDenominationsValue[i] || i<=currencyDenominationsValue.length)
			   {
				   
				   size[i]= amount / currencyDenominationsValue[i];
				   amount =amount -(size[i] * currencyDenominationsValue[i]);
				  
				   
			   }
			   
		   }
		   if(amount==0)
		   {
			   System.out.println("Your payment approach in order to give min no of notes will be :");
			   for(int j=0;j<currencyDenominationsValue.length;j++)
				{
					if(size[j]!=0)
					{
						
						System.out.println(currencyDenominationsValue[j]+":"+size[j]);
					}
				}
		   }
		   
		   else if (amount>0)
		  
		   {
			   System.out.println("Unable to find");
		   }
	}

}
