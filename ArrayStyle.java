import java.util.Arrays;
  public class ArrayStyle{
    public static void main(String[] args){
   int[] array = {10, 20, 30, 40};
  System.out.println(Arrays.toString(numbers(array)));
  }
  public static int[] numbers(int[] array){
    int[] result = new int[array.length];  
 for (int count = 0; count < array.length; count++){
     result[count] += array[count];
    }
     return result;
  }
}