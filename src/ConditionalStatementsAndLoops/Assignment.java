package ConditionalStatementsAndLoops;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Assignment {

	public static void main(String[] args) {
		
		
	/*	Bank Transactions
Positive value refers Credit and Negative refers Debit Transaction

Transactions Amount
		1 50000
		2 -2000
		3 3000
		4 -15000
		5 -200
		6 -300
		7 4000
		8 -3000
		*/
		
		
		//1. Print total number of credit and debit transactions completed
           List<Integer> credit=new ArrayList<Integer>();  //storing credit transactions 
           credit.add(50000);
           credit.add(3000);
           credit.add(4000);
           System.out.println("no.of credit transactions completed :"+credit.size());
           
           List<Integer> debit=new ArrayList<Integer>();   //storing debit transactions
           debit.add(-2000);
           debit.add(-15000);
           debit.add(-200);
           debit.add(-300);
           debit.add(-3000);
           System.out.println("no.of debit transactions completed :"+debit.size());
      
      //2. Print the total amount credited and debited in account
           int creditSum=0;
           int debitSum=0;
           for(int i=0;i<credit.size();i++) {     //credit loop
        	   
        	   creditSum=creditSum+credit.get(i);
           }
           System.out.println("credit amount is : "+creditSum);
           
           for(int i=0;i<debit.size();i++) {      //debit loop
        	   
        	   debitSum=debitSum+debit.get(i);
           }
           System.out.println("debit amount is : "+debitSum);
           
           
           
       //3. Print total amount remaining at the end in Bank Account
           int availableAmount=creditSum+debitSum;
           System.out.println("remaining amount in bank : "+availableAmount);
           
       
       /*4. If any transaction limit exceeds +/- 10000 then print the message “Suspicious credit/ debit
           Transaction with Amount” and also print total number of suspicious transactions */
           
           List<List<Integer>> totalTransactions=new LinkedList<List<Integer>>();
           totalTransactions.add(credit);
           totalTransactions.add(debit);
           
           System.out.println(totalTransactions);
           for(int i=0;i<totalTransactions.size();i++) {
        	   
        	  System.out.println(totalTransactions.get(i));
        	   
        	          	   
           }
           
           
	}

}
