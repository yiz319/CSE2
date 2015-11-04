////////////////////////////////////////////////////////////////////////////////////
//Yiheng Zhu
//hw10
//Shuffling Java Program
//
//  first compile th program 
//      javac Shuffling.java
//  run the program
//      java Shuffling//

import java.util.Scanner;
//  define a class
public class Shuffling{
        
// add main method
    
  public static void main(String[] args){
     Scanner myScanner = new Scanner(System.in);
     String[] suitNames={"C","H","S","D"};   
   String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"};
   String[] cards = new String[52];
   String[] hand = new String[5];
  for (int i=0; i<52; i++){
   cards[i]=rankNames[i%13]+suitNames[i/13];
   System.out.print(cards[i]+" ");
   
 }System.out.println(" ");
  shuffle(cards); 
  printArray(cards);
  hand = randomizeHand(cards);
  printArray(hand);
  }
  public static void printArray(String[] cards){
   for (int i=0; i<52; i++){
  
   System.out.print(cards[i]+" ");}
   System.out.println(" ");
  }//end
  public static void shuffle(String[] cards){
      System.out.println("Shuffled:");
      for(int i=0;i<52;i++){
          int random=(int)(Math.random()*52);
      
    String s = cards[random]; 
    cards[random] = cards[i];
    cards[i] = s;} 
      return;
  }//end
  public static String[] randomizeHand(String[] cards){
      System.out.println("randomized hand:");
      String hand[]=new String[5];
       for(int i=0;i<5;i++){
          int r=(int)(Math.random()*52);
      cards[i]=cards[r];
       hand[i]= cards[i];}
      return hand;
  }
  
  
}