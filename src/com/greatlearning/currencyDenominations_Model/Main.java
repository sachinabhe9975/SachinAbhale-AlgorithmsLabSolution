package com.greatlearning.currencyDenominations_Model;
import com.greatlearning.descendingSort.*;
import java.util.*;


public class Main {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int size;
		int amountToPay;
		int amount;
		
		System.out.println("Enter the size of currency denominations : ");
		size=sc.nextInt();
		int[] currencyDenominationsValue=new int[size];
		System.out.println("Enter the currency denominations value :");
		int i;
		for(i=0;i<size;i++)
		{
			currencyDenominationsValue[i]=sc.nextInt();
		}
		DecendingSort.sortInDec(currencyDenominationsValue );
		System.out.println("Enter the amount you want to pay:");
		amount=sc.nextInt();
        
        MinNotesApproach.minNotesApproach(currencyDenominationsValue, amount);
	}

}
