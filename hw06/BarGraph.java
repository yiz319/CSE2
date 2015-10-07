////////////////////////////////////////////////////////////////////////////////////
//Yiheng Zhu
//hw06
//BarGraph Java Program
//
//  first compile th program 
//      javac BarGraph.java
//  run the program
//      java BarGraph//

import java.util.Scanner;
//  define a class
public class BarGraph{
    
// add main method
  public static void main(String[] args){
      Scanner myScanner = new Scanner( System.in );
      System.out.print("Expenses for Monday  $: ");
      double Monday = myScanner.nextDouble() ;
        if (Monday<0) {
          System.out.print("Please only positive number, Try again $: ");
       }
      System.out.print("Expenses for Tuesday   $: ");
      double Tuesday = myScanner.nextDouble() ;
       if (Tuesday<0) {
          System.out.print("Please only positive number, Try again $: ");
       }
      System.out.print("Expenses for Wednesday   $: ");
      double Wednesday = myScanner.nextDouble() ;
       if (Wednesday<0) {
          System.out.print("Please only positive number, Try again $: ");
       }
      System.out.print("Expenses for Thursday   $: ");
      double Thursday = myScanner.nextDouble() ;
        if (Thursday<0) {
          System.out.print("Please only positive number, Try again $: ");
       }
      System.out.print("Expenses for Friday   $: ");
      double Friday = myScanner.nextDouble() ;
       if (Friday<0) {
          System.out.print("Please only positive number, Try again $: ");
       }
      System.out.print("Expenses for Saturday   $: ");
      double Saturday = myScanner.nextDouble() ;
        if (Saturday<0) {
          System.out.print("Please only positive number, Try again $: ");
       }
      System.out.print("Expenses for Sunday   $: ");
      double Sunday = myScanner.nextDouble() ;
        if (Sunday<0) {
          System.out.print("Please only positive number, Try again $: ");
       }
      //scanner
     
      
      double weeklyExpenses=Monday+Tuesday+Wednesday+Thursday+Friday+Saturday+Sunday;
      double dailyExpenses=weeklyExpenses/7;
      double persent=(double)(-20+Math.random()*40);
      double estimateWeekCost;
      double totalCost=weeklyExpenses;
      int week =208;
      while (week>1){
          estimateWeekCost=weeklyExpenses*((100+persent)/100);
          totalCost=totalCost+estimateWeekCost;
          totalCost=totalCost*100;
          totalCost=Math.round(totalCost);
          totalCost=totalCost/100;
          week--;
      }//end of loop
      

       System.out.print("Mon:  ");
      while(Monday>0.5){
            System.out.print("*");
          Monday--;}
      System.out.println(" ");// monday
       System.out.print("Tues: ");
      while(Tuesday>0.5){
            System.out.print("*");
          Tuesday--;}
      System.out.println(" ");//tuesday
       System.out.print("Wed:  ");
      while(Wednesday>0.5){
            System.out.print("*");
          Wednesday--;}
      System.out.println(" ");//wednesday
       System.out.print("Thur: ");
      while(Thursday>0.5){
            System.out.print("*");
          Thursday--;}
      System.out.println(" ");//thursday
       System.out.print("Fri:  ");
      while(Friday>0.5){
            System.out.print("*");
         Friday--;}
      System.out.println(" ");//friday
      System.out.print("Sat:  ");
      while(Saturday>0.5){
            System.out.print("*");
          Saturday--;}
      System.out.println(" ");//saturday
       System.out.print("Sun:  ");
      while(Sunday>0.5){
            System.out.print("*");
          Sunday--;}
      System.out.println(" ");//Sunday end of while loop 
      
      System.out.println("Your average daily expenses are: $ "+dailyExpenses);
      System.out.println("Estimated expenditure for 4 years: $ "+totalCost);
      
      
      
      
      }
}