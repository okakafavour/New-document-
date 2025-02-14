import java.util.Arrays;
  public class ArrayReverse{
   public static void main(String[] args){
    int[] array = {10,20,30,40,50};
   System.out.println(Arrays.toString(numbers(array)));
  }
 public static int[] numbers(int[] array){
  int[] reverse = new int[array.length];
  for (int count = 0; count < array.length; count++){
      reverse[count] += array[array.length - 1 - count];
   }
   return reverse;
 }
}  