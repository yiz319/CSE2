////////////////////////////////////////////////////////////////////////////////////
//Yiheng Zhu
//lab04
//CardGenerator Java Program
//
//  first compile th program 
//      javac CardGenerator.java
//  run the program
//      java CardGenerator//
//  define a class
public class CardGenerator{
    
// add main method
  public static void main(String[] args){
 int number = (int)(Math.random()*52)+1;
 String card;
 String suit;
 if(number>0 & number<14){
     String suit= "diamond";
 }
 if (number>13 & number<27){
     String suit="club";
 }
 if (number>26 & number<40){
     String suit="hearts";
 }
 if (number>39 & number<53){
     String suit="spades";
 }
 int card =number;
 if (card=1 || 14||27||40) {
      card= "Ace";
 }
 if (card=11||24||37||50) {
      card="Jake";
 }
 if (card= 12||25||38||51) {
     String card="Queen";
 }
 if (card= 13||26||39||52) {
     String card="King";
 }
 if (card>1 & card<11) {
     String card= number; 
 }
 if (card>14 & card<24){
     String card= number- 13;
 }
 if (card>27 & card<37){
     String card= number- 26;
 }
 if (card>40 & card<50){
     String card=number - 39;
 }
 System.out.println("You picked the "+card+" of "+suit);
 
  }
}