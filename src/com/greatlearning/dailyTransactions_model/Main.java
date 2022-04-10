package com.greatlearning.dailyTransactions_model;
import java.util.*;

import com.greatlearning.dailyTarget_Services.DailyTargetCheck;


public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int size;
		int noOfTarger;
		int valueOfTarget;
		DailyTargetCheck p=new DailyTargetCheck();
	    int[] transactionArray;
		System.out.println("Enter the size of transaction array  :");
		size=sc.nextInt();
		System.out.println("Enter the values of array  : ");
		transactionArray=new int[size];
		for(int i=0 ; i<size ; i++)
		{
			transactionArray[i]=sc.nextInt();
			
		}
		
       System.out.println("Enter the total no of targets that needs to be achieved");
       noOfTarger=sc.nextInt();
       
       for(int j=0; j<noOfTarger;j++)
       {
    
       System.out.println("Enter the value of target :");
       valueOfTarget=sc.nextInt();
       p.checkTarget(valueOfTarget, transactionArray,size);
       
       }
	}

}
