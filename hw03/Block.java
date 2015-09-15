////////////////////////////////////////////////////////////////////////////////////
//Yiheng Zhu
//hw03
//Block Java Program
//
//  first compile th program 
//      javac Block.java
//  run the program
//      java Block//

import java.util.Scanner;
//  define a class
public class Block{
    
// add main method
  public static void main(String[] args){
      Scanner myScanner = new Scanner( System.in );
      System.out.print("Enter the length of the block: ");
      double length = myScanner.nextDouble() ;
      System.out.print("Enter the width of the block:");
      double width = myScanner.nextDouble();
      System.out.print("Enter the height of the block: ");
      double height = myScanner.nextDouble() ;
      double volume;
      volume= (height*width*length);
      double surfaceArea;
      surfaceArea=((length*width*2)+(width*height*2)+(length*height*2));
      System.out.println("The volume of the block of dimensions "+ length+" x "+width+" x "+height+" is "+volume);
      System.out.println("The surface area of the block is "+ surfaceArea);
  }
}
     