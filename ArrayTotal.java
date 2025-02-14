import java.util.Arrays;
  public class ArrayTotal{
   public static void main(String[] args){

   int[] array = {10,20,30,40};
   System.out.println(numbers(array));
 }
 public static int numbers(int[] array){
  int sum =0;
  for(int count = 0; count < array.length; count++){
     sum += array[count];


    }
    return sum;
  }
}