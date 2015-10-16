////////////////////////////////////////////////////////////////////////////////////
//Yiheng Zhu
//lab07
//Twisty Java Program
//
//  first compile th program 
//      javac Twisty.java
//  run the program
//      java Twisty
import java.util.Scanner;
//  define a class
public class Twisty{
    
// add main method
  public static void main(String[] args){
      Scanner myScanner = new Scanner( System.in );
      System.out.print("Enter your desired length: ");
      int length = myScanner.nextInt() ;
      System.out.print("Enter your desired width: ");
      int width = myScanner.nextInt() ; 