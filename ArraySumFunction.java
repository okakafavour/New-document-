import java.util.Arrays;
  public class ArraySumFuntions{
    public static void main(String[] args){
     int[] array = {1,23,4,5};
   System.out.println(Arrays.toString(numbers(array)));

  }
  public static int[] numbers(int[] array){

   int sum = 0;
   for (int count = 0; count < array.length; count++){
     sum += array[count];

    }
   int[] result = {sum};
   return result;
  }
}