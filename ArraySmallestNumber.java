import java.util.Arrays;
  public class ArraySmallestNumber {
   public static void main(String[] args ){

   int[] array = {1, 2, 3, 4,5};
  System.out.print(Arrays.toString(numbers(array)));

   }
 public static int[] numbers(int[] array){
  int[] lowArray = array[0];
 
  for (int count = 0; count < array.length; count++) {
    if (array[count] < lowArray) {
      lowArray = array[count];
      
   }
}
 return lowArray;
  }
 

}

 