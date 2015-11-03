////////////////////////////////////////////////////////////////////////////////////
//Yiheng Zhu
//hw08
//Area Java Program
//
//  first compile th program 
//      javac Area.java
//  run the program
//      java Area
import java.util.Scanner;
//  define a class
public class Area{
    
     // declare a method 
  public static double triangle(double h,double b){
    return h*b/2 ;
  }
 // declare a method 
  public static double rectangle(double h,double b){
    return h*b;
  }
// declare a method 
  public static double circle(double r){
    return 3.1415926*r*r;
  }

    


    
// add main method
  public static void main(String[] args){
      Scanner myScanner = new Scanner( System.in );
      System.out.print("Enter your shape: ");
      String shape = myScanner.nextString() ;
      while (shape==shape){
        if (shape=="triangle"){
         System.out.print("enter the hight:");
         double h= myScanner.nextDouble() ;
         System.out.print("enter the base:");
         double b= myScanner.nextDouble() ;
         
         double triangle = triangle(h,b);
         System.out.println("Area is "+triangle);
        
        }
        else if (shape=="rectangle"){
         System.out.print("enter the hight:");
        double h= myScanner.nextDouble() ;
         System.out.print("enter the base:");
        double b= myScanner.nextDouble() ;
         
         double rectangle=rectangle(h,b);
         System.out.println("Area is "+rectangle); 
        }
        else if (shape=="circle"){
         System.out.print("enter the radius:");
         double r= myScanner.nextDouble();
         
         
         double circle=circle(r);
         System.out.println("area is"+circle);}
        else {
          System.out.print("enter triangle, rectangle or circle:");
          shape = myScanner.nextString() ;
        }
      }
      
  
      
      
      
      
  }

}
   