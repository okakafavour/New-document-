
import java.util.Arrays;
 public class ArraySmallest{
  public static void main(String[] args){
     
  int[] array = {4, 5, 1, 6, 8};
 System.out.print(Arrays.toString(numbers(array)));
  }
 public static int[] numbers(int[] array){
 int min = array[0];
 
 
 for (int count = 0; count < array.length; count++){
   if (array[count] < min){
      min = array[count];
    }
     
     }
   return new int[] {min};
  }
}