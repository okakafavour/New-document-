import java.util.Arrays;
 public class median{
  public static void main(String[] args){

  int[] array = {1,2,3,78,5,6,7};
System.out.println(numbers(array));
     }
 public static int numbers(int[] array){
 int newArray = array.length;
 int result = 0;
   if ( newArray % 2 == 1){

    result = array[newArray / 2];

 }
return result;

     }
  }