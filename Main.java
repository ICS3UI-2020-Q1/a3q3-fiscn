import java.util.Scanner; 

/**
 * Tells you your grade percentage based on your letter grade 
 * @author Neil Fischer
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) { 
    //create Scanner for user input 
    Scanner input = new Scanner(System.in); 

    //ask the user to input there letter grade 
    System.out.println("Please enter a letter grade"); 
    String choice = input.nextLine(); 

    switch(choice){
      case "A": 
      System.out.println("This is between 80-100%");
      break; 
      case "B": 
      System.out.println("this is between 70-79%"); 
      break; 
      case "C": 
      System.out.println("60-69%"); 
      break; 
      case "D": 
      System.out.println("50-59%"); 
      break; 
      case "F": 
      System.out.println("0-49%"); 
      break; 
      default: 
      System.out.println("Invalid Grade");
    }  


    
    
  }
}
