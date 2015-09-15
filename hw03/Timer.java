////////////////////////////////////////////////////////////////////////////////////
//Yiheng Zhu
//hw03
//Timer Java Program
//
//  first compile th program 
//      javac Timer.java
//  run the program
//      java Timer//

import java.util.Scanner;
//  define a class
public class Timer{
    
// add main method
  public static void main(String[] args){
      Scanner myScanner = new Scanner( System.in );
      System.out.print("Enter the current time xxxx: ");
      int CurrentTime = myScanner.nextInt() ;
      System.out.print("Enter the time you will be eating dinner (in the form xxxx):");
      int EatingTime = myScanner.nextInt();
      int Hours;
      Hours=((EatingTime-CurrentTime)/100);
      int Minutes;
      Minutes=((EatingTime-CurrentTime)-(100*Hours));
      System.out.println("You have "+ Hours +" hours and "+ Minutes +" minutes until dinner.");
  }
}
     