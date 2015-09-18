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
    
         String suit="";
         if(number>0 & number<14){
             suit= "diamond";
         }
         if (number>13 & number<27){
             suit="club";
         }
         if (number>26 & number<40){
             suit="hearts";
         }
         if (number>39 & number<53){
             suit="spades";
         }
         int card =number;
         String type=" ";
         switch(number){
             case 1:case 14: case 27: case 40: type = "Ace";
             break;
             case 11: case 24: case 37: case 50: type = "Jack";
             break;
             case 12: case 25: case 38: case 51: type ="Queen";
             break;
             case 13: case 26: case 39: case 52: type ="King";
             break;
             default: type= Integer.toString(card);
             break;
            
         }
        
         if (number>1 & number<11) {
              card= number; 
         }
         if (number>14 & number<24){
              card= number- 13;
         }
         if (number>27 & number<37){
              card= number- 26;
         }
         if (number>40 & number<50){
              card=number - 39;
         }
         if(number==1||number==14||number==27||number==40||number==11||number==24||number==37||number==50||number== 12||number==25||number==38||number==51||number== 13||number==26||number==39||number==52){
         System.out.println("You picked the "+ type +" of "+ suit);}
         else {System.out.println("You picked the "+ card +" of "+ suit);
         }
      }
    }