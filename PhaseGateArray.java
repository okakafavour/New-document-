import java.util.Arrays; 
  public class PhaseGateArray{
   public static void main(String[] args){

      int[] input = {1,4,6,2,5};
    System.out.println(Arrays.toString(numbers(input)));
   }
  public static int[] numbers(int[] input){
  int[] array = 6;
  int result = 0;

  for (int count = 0; count < input; count++){
       if(input[count] < result){ 

     result= input[count];
}
array[count] = result;

    }
    return array;
   }
 }