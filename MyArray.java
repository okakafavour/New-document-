import java.util.Arrays;
  public class MyArrays{
   public static void main(String[] args){
   int[] array = {1, 3, 5, 7, 8};
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