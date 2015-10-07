////////////////////////////////////////////////////////////////////////////////////
//Yiheng Zhu
//hw01
//WelcomeClass Java Program
//
//  first compile th program 
//      javac WelcomeClass.java
//  run the program
//      java WelcomeClass//


//  define a class
public class WelcomeClass{
    
// add main method
  public static void main(String[] args){
      
//  print the statement with box around it
    System.out.println("---------------------------------------------");
    System.out.println("【                 WELCOME                 】");
    System.out.println("---------------------------------------------");
    System.out.println("     ^     ^     ^     ^     ^     ^   ");
    System.out.println("   /   \\ /   \\ /   \\ /   \\ /   \\ /   \\ ");
    System.out.println("<--- Y --- I --- Z --- 3 --- 1 --- 9 --->");
    System.out.println("   \\   / \\   / \\   / \\   / \\   / \\   /   ");
    System.out.println("     v     v     v     v     v     v   ");
    System.out.println("this summer i did nothing special, and i dont even wanna talk about it.");
    System.out.println("test");

    int counter = 0;
  while (counter < 3){
     if((++counter)%2==0){
	System.out.println("Counter:" + counter);
      }
}
    //test/testtest
  }
}