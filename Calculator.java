import java.util.*;

public class Calculator{

  public static void main(String[] args){
  
    int operator, n1, n2;
    
    System.out.println("1 for Add \n2 for Subtract \n3 for Multiply \n4 for Divide");
    
    System.out.println();
    
    System.out.print("Choose Operator: ");
    
    Scanner console = new Scanner(System.in);
    
    operator = console.nextInt();
    
    System.out.println();
    
    System.out.print("Enter your 1st number: ");
    
    n1 = console.nextInt();
    
    System.out.println();
    
    System.out.print("Enter your 2nd number: ");
    
    n2 = console.nextInt();
    
    System.out.println();
    
    int result = 0;
    
    switch(operator){
    
      case 1:
      
      result = n1 + n2;
      
      break; 
      
      case 2:
      
      result = n1 - n2;
      
      break;
      
      case 3:
      
      result = n1 * n2;
      
      break;
      
      case 4:
      
      result = n1/n2;
      
      break;
      
      default:
      
      System.out.println("Entered operator is not valid.");
    
    
    }
    
    System.out.println("*************************");
    
    System.out.println();
   
    System.out.println("The result is: " + result);
    
    
   
    
 
  
  }





}