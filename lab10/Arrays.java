    ////////////////////////////////////////////////////////////////////////////////////
    //Yiheng Zhu
    //lab10
    //Arrays Java Program
    //
    //  first compile th program 
    //      javac Arrays.java
    //  run the program
    //      java Arrays//
    
    import java.util.Scanner;
    //  define a class
    public class Arrays{
        
    // add main method
    
      public static void main(String[] args){
          Scanner myScanner = new Scanner(System.in);
          int number= (int)(Math.random()*5)+5;
          System.out.println("enter "+ number+ " students' names:");
          String []student=new String[number];
          
          for (int i =0;i<number;i++ ){
              student[i]=myScanner.next();
           }
          
          System.out.println("here is the "+number+" students' grade:");
           int[]score=new int[number];
          for(int i=0;i<number;i++){
            score[i]=(int)(Math.random()*100);
            System.out.println(student[i]+":"+score[i]);
          }
      }
    }
          