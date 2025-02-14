import java.util.Arrays;
  public class ArrayMax{
   public static void main(String[] args){

  int[] array = {201, 300, 404, 25, 500};
 System.out.println(Arrays.toString(numbers(array)));
 
  }
 public static int[] numbers(int[] array){
 int max = array[0];

  for (int count = 0; count < array.length; count++){
     if (array[count] > max){
      max = array[count];         

         }
     }
   return new int[] {max};
   }
}