import java.util.Arrays;
  public class ArrayEven{
   public static void main(String[] args){
 
    int[] array ={1,4,5,6,7,8};
 System.out.println(Arrays.toString(numbers(array)));
   }
 public static int[] numbers(int[] array){
 
 for (int count = 0; count < array.length; count++){
   if (array[count]  % 2 != 0){
    int[] result = new int[array.length];
     result[count] += array[count];
        } 
     }
    return result;
   }
 }