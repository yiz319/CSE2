    ////////////////////////////////////////////////////////////////////////////////////
    //Yiheng Zhu
    //hw04
    //CardInterpreter Java Program
    //
    //  first compile th program 
    //      javac CardInterpreter.java
    //  run the program
    //      java CardInterpreter//
    //  define a class
    public class CardInterpreter{
        
    // add main method
    
      public static void main(String[] args){
         int number = (int)(Math.random()*13)+1;
         int ssuit =(int)(Math.random()*4)+1;
    
         String suit="";
         if(ssuit==1){
             suit= "diamond";
         }
         if (ssuit==2){
             suit="club";
         }
         if (ssuit==3){
             suit="hearts";
         }
         if (ssuit==4){
             suit="spades";
         }
         
         String type=" ";
         switch(number){
             case 1: type = "Ace";
             break;
             case 11: type = "Jack";
             break;
             case 12: type ="Queen";
             break;
             case 13: type ="King";
             break;
             case 2: type ="2";
             break;
             case 3: type="3";
             break;
             case 4: type="4";
             break;
             case 5: type="5";
             break;
             case 6: type="6";
             break;
             case 7: type="7";
             break;
             case 8: type="8";
             break;
             case 9: type="9";
             break;
             default: type="10";
             break; 
         }
        int number1 = (int)(Math.random()*13)+1;
         int ssuit1 =(int)(Math.random()*4)+1;
    
         String suit1="";
         if(ssuit1==1){
             suit1= "diamond";
         }
         if (ssuit1==2){
             suit1="club";
         }
         if (ssuit1==3){
             suit1="hearts";
         }
         if (ssuit1==4){
             suit1="spades";
         }
         
         String type1=" ";
         switch(number1){
             case 1: type1 = "Ace";
             break;
             case 11: type1 = "Jack";
             break;
             case 12: type1 ="Queen";
             break;
             case 13: type1 ="King";
             break;
             case 2: type1 ="2";
             break;
             case 3: type1="3";
             break;
             case 4: type1="4";
             break;
             case 5: type1="5";
             break;
             case 6: type1="6";
             break;
             case 7: type1="7";
             break;
             case 8: type1="8";
             break;
             case 9: type1="9";
             break;
             default: type1="10";
             break;
            
         }
        
       
         int number2 = (int)(Math.random()*13)+1;
         int ssuit2 =(int)(Math.random()*4)+1;
    
         String suit2="";
         if(ssuit2==1){
             suit2= "diamond";
         }
         if (ssuit2==2){
             suit2="club";
         }
         if (ssuit2==3){
             suit2="hearts";
         }
         if (ssuit2==4){
             suit2="spades";
         }
         
         String type2=" ";
         switch(number2){
             case 1: type2 = "Ace";
             break;
             case 11: type2 = "Jack";
             break;
             case 12: type2 ="Queen";
             break;
             case 13: type2 ="King";
             break;
             case 2: type2 ="2";
             break;
             case 3: type2="3";
             break;
             case 4: type2="4";
             break;
             case 5: type2="5";
             break;
             case 6: type2="6";
             break;
             case 7: type2="7";
             break;
             case 8: type2="8";
             break;
             case 9: type2="9";
             break;
             default: type2="10";
             break;
         }
         int number3 = (int)(Math.random()*13)+1;
         int ssuit3 =(int)(Math.random()*4)+1;
    
         String suit3="";
         if(ssuit3==1){
             suit3= "diamond";
         }
         if (ssuit3==2){
             suit3="club";
         }
         if (ssuit3==3){
             suit3="hearts";
         }
         if (ssuit3==4){
             suit3="spades";
         }
         
         String type3=" ";
         switch(number3){
             case 1: type3 = "Ace";
             break;
             case 11: type3 = "Jack";
             break;
             case 12: type3 ="Queen";
             break;
             case 13: type3 ="King";
             break;
             case 2: type3 ="2";
             break;
             case 3: type3="3";
             break;
             case 4: type3="4";
             break;
             case 5: type3="5";
             break;
             case 6: type3="6";
             break;
             case 7: type3="7";
             break;
             case 8: type3="8";
             break;
             case 9: type3="9";
             break;
             default: type3="10";
             break;
         }
         int number4 = (int)(Math.random()*13)+1;
         int ssuit4 =(int)(Math.random()*4)+1;
    
         String suit4="";
         if(ssuit4==1){
             suit4= "diamond";
         }
         if (ssuit4==2){
             suit4="club";
         }
         if (ssuit4==3){
             suit4="hearts";
         }
         if (ssuit4==4){
             suit4="spades";
         }
         
         String type4=" ";
         switch(number4){
             case 1: type4 = "Ace";
             break;
             case 11: type4 = "Jack";
             break;
             case 12: type4 ="Queen";
             break;
             case 13: type4 ="King";
             break;
             case 2: type4 ="2";
             break;
             case 3: type4="3";
             break;
             case 4: type4="4";
             break;
             case 5: type4="5";
             break;
             case 6: type4="6";
             break;
             case 7: type4="7";
             break;
             case 8: type4="8";
             break;
             case 9: type4="9";
             break;
             default: type4="10";
             break;
         }
      
         
         System.out.println("You picked the "+ type +" of "+ suit);
         System.out.println("You picked the "+ type1 +" of "+ suit1);
         System.out.println("You picked the "+ type2 +" of "+ suit2);
         System.out.println("You picked the "+ type3 +" of "+ suit3);
         System.out.println("You picked the "+ type4 +" of "+ suit4);
         
         int N=0;//number of the pairs 
         if (type==type1&type1==type2&type2==type3){
             N=N+6; }
         else if (type==type1&type1==type3&type3==type4){
             N=N+6; }
         else if (type==type1&type1==type2&type2==type4){
             N=N+6; }
         else if (type==type2&type2==type3&type3==type4){
             N=N+6; }
         else if (type1==type2&type2==type3&type3==type4){
             N=N+6; }
         else if (type==type1&type1==type2&type3==type4){
             N=N+5; }
         else if (type==type1&type1==type3&type2==type4){
             N=N+5; }
         else if (type==type1&type1==type4&type3==type2){
             N=N+5; }
         else if (type==type2&type2==type3&type1==type4){
             N=N+5; }
         else if (type==type2&type2==type4&type1==type3){
             N=N+5; }
         else if (type==type3&type3==type4&type1==type2){
             N=N+5; }
         else if (type1==type2&type3==type2&type==type4){
             N=N+5; }
         else if (type1==type3&type3==type4&type==type2){
             N=N+5; }
         else if (type1==type2&type2==type4&type3==type){
             N=N+5; }
         else if (type2==type3&type3==type4&type==type1){
             N=N+5; }
         else if (type==type1&type1==type2){
             N=N+3; }
         else if (type==type1&type1==type3){
             N=N+3; }
         else if (type==type1&type1==type4){
             N=N+3; }
         else if (type==type2&type2==type3){
             N=N+3; }
         else if (type==type2&type2==type4){
             N=N+3; }
         else if (type==type3&type3==type4){
             N=N+3; }
         else if (type1==type2&type3==type2){
             N=N+3; }
         else if (type1==type3&type3==type4){
             N=N+3; }
         else if (type1==type2&type2==type4){
             N=N+3; }
         else if (type2==type3&type3==type4){
             N=N+3; }
         else if (type==type1&type2==type3){
             N=N+2; } 
         else if (type==type1&type2==type4){
             N=N+2; }
         else if (type==type1&type3==type4){
             N=N+2; }
         else if (type==type2&type1==type3){
             N=N+2; }
         else if (type==type2&type1==type4){
             N=N+2; }
         else if (type==type2&type3==type4){
             N=N+2; }
         else if (type==type3&type1==type2){
             N=N+2; }
         else if (type==type3&type1==type4){
             N=N+2; }
         else if (type==type3&type2==type4){
             N=N+2; }
         else if (type==type4&type1==type2){
             N=N+2; }
         else if (type==type4&type1==type3){
             N=N+2; }
         else if (type==type4&type2==type3){
             N=N+2; }
         else if (type1==type2&type3==type4){
             N=N+2; }
         else if (type1==type3&type2==type4){
             N=N+2; }
         else if (type1==type4&type2==type3){
             N=N+2; }
         else if( type==type1 ){
             N=N+1;    }
         else if( type==type2){
             N=N+1;  }
         else if (type==type3){
             N=N+1;  }
         else if (type==type4){
             N=N+1;  }
         else if (type1==type2){
             N=N+1;  }
         else if (type1==type3){
             N=N+1; }
         else if (type1==type4){
             N=N+1; }
         else if (type2==type3){
             N=N+1; }
         else if (type2==type4){
             N=N+1; }
         else if (type3==type4){
             N=N+1; }
         else {System.out.println("you have a high card hand!");
         }
         
         if (N==1){
             System.out.println("you have a pair");
         }
         if (N==2){
             System.out.println("you have two pairs");
         }
         if (N==3){
             System.out.println("you have three of a kind");
         }
         if (N==5){
             System.out.println("you have three of a kind and a pair");
         }
         if (N==6){
             System.out.println("you have four of a kind");
         }
         }
      }