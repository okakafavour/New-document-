import java.util.Arrays;
  public class ArraySum{
    public static void main(String[] args){
  int[] array = {10,30,40,70};
  System.out.println(Arrays.toString(numbers(array)));
 }
 public static int[] numbers(int[] array){
  int sum = 0;
  int[] result = {sum};
  for (int count = 0; count < array.length; count++){
      result += array[count];

     }
    return result;
  }
}    