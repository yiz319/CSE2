////////////////////////////////////////////////////////////////////////////////////
//Yiheng Zhu
//lab08
//Stats Java Program
//
//  first compile th program 
//      javac Stats.java
//  run the program
//      java Stats
import java.util.Scanner;
//  define a class
public class Stats{

    
// add main method
  public static void main(String[] args){
      Scanner myScanner = new Scanner( System.in );
      System.out.print("Enter your first number: ");
      double n1 = myScanner.nextDouble() ;
      System.out.print("Enter your second number : ");
      double n2 = myScanner.nextDouble() ;
      while (n1>=n2){
         System.out.print("reenter a larger number for number two:");
         n2= myScanner.nextDouble() ;
      }
      System.out.print("Enter your third number: ");
      double n3 = myScanner.nextDouble() ;
      while (n2>=n3){
         System.out.print("reenter a larger number for number three:");
         n3= myScanner.nextDouble() ;
      }
      System.out.print("Enter your fourth number: ");
      double n4 = myScanner.nextDouble() ;
      while (n3>=n4){
         System.out.print("reenter a larger number for number four:");
         n4= myScanner.nextDouble() ;
      }
      System.out.print("Enter your fifth number: ");
      double n5 = myScanner.nextDouble() ;
      while (n4>=n5){
         System.out.print("reenter a smaller number for number five:");
         n5= myScanner.nextDouble() ;
      }
      double mean= mean(n1, n2, n3, n4, n5);
      double median=median(n1, n2, n3, n4, n5);   
      
      System.out.println("mean is "+mean);
      System.out.println("median is "+ median);      
      
      
      
      
  }
 // declare a method 
public static double mean(double n1,double n2,double n3,double n4,double n5){
    return (n1+n2+n3+n4+n5)/5 ;
}
 // declare a method 
public static double median(double n1,double n2,double n3,double n4,double n5){
    return n3;
}
    
}
      