
import java.util.Scanner;
 public class Boolean2{
  public static void main(String... args){
  
  Scanner input = new Scanner(System.in);

  System.out.println("Enter an primeNumber");
  int numbers = input.nextInt();

  System.out.println(primeNumber(numbers));

   }

  public static String primeNumber(int numbers){
  
 if (numbers <= 1){
  return "False";
} 
 
   for (int count = 2; count < numbers; count++){
    if (numbers % count == 0){
         return "False";
       }

     }
    return "True";
  }
}