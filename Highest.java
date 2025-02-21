import java.util.Arrays;
 public class Highest{
   public static void main(String[] args){

   int[][] array = {{100,400,300,500},{10,20,40,50},{80,60,5,220,99}};

 System.out.println(numbers(array));
     }
  public static int numbers(int[][] array){
   int max = array[0][0];

   for (int count = 0; count < array.length; count++){
     for (int counter = 0; counter < array[count].length; counter++){
            if (array[count][counter] > max){
            max = array[count][counter];

                  }


             }

        }
  return max;
    }

 }