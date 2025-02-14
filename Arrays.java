import java.util.Arrays;
 public class ArraysExaample{
   public static void main(String[] args){
  int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
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