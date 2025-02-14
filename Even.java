import java.util.Arrays;
  public class Even{
    public static void main(String[] args){
   int[] array = {1,2,3,4,5,6,7,8,9};
   System.out.println(Arrays.toString(numbers(array)));

  }
   public static int[] numbers(int[] array){
  int[] result = new int[array.length];
  for (int count = 1; count < array.length; count++){
        if (count % 2 == 0){
      result[count] += array[count];
  }
     } 
       return result;
   }
    
}