import java.util.Scanner;
 public class Boolean{
  public static void main(String... args){
  
  Scanner input = new Scanner(System.in);

  System.out.println("Enter an integer: ");
  int number = input.nextInt();
  
  
  System.out.print(value(number));
      }

  public static String value(int number){
   
   if ( number % 2 == 0){
 
    return "True";
            } else {

     return "False";
        }

     }

}