////////////////////////////////////////////////////////////////////////////////////
//Yiheng Zhu
//hw02
//Arithmetic Java Program
//
//  first compile th program 
//      javac Arithmetic.java
//  run the program
//      java Arithmetic//


//  define a class
public class Arithmetic{
    
// add main method
  public static void main(String[] args){
 //Number of pairs of socks
 int nSocks=3;
 //Cost per pair of socks
 //('$' is part of the variable name)
 double sockCost$=2.58;
 
 //Number of drinking glasses 
 int nGlasses=6;
 //Cost per glass
 double glassCost$=2.29;
 
 //Number of boxes of envelopes 
 int nEnvelopes=1;
 //cost per box of envelopes
 double envelopeCost$=3.25;
 double taxPercent=0.06;
 double totalCost$,totalTax$;
 
 
 System.out.println("total cost of socks is"+(nSocks*sockCost$));
 System.out.println("total cost of glasses is"+(nGlasses*glassCost$));
 System.out.println("total cost of envolopes is"+(nEnvelopes*envelopeCost$));
 totalCost$=nSocks*sockCost$+nGlasses*glassCost$+nEnvelopes*envelopeCost$;
 totalTax$= totalCost$*taxPercent;
 System.out.println("sales tax for that total cost is"+totalTax$);
 System.out.println("total cost of purchase is"+totalCost$);
 System.out.println("total cost including tax is"+(totalCost$+totalTax$));
 
 
  }
}