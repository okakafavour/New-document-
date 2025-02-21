import java.util.Arrays;
 public class LowestToHighest{
   public static void main(String[] args){

 int[][] array = {{100,400,300,500},{10,20,40,50},{80,60,5,220,99}};
 System.out.println(Arrays.toString(numbers(array)));

       }
  public static int[] numbers(int[][] array){
 int totalElements = 0;

  for (int value = 0; value < array.length; value++){
   totalElements += array[value].length;
 }

 int[] newArray = new int[totalElements];
 int index = 0;

   for (int count = 0; count < array.length; count++){
     for (int counter = 0; counter < array[count].length; counter++){

         newArray[index] = array[count][counter];
        index++;

                  
             }

         }


    for ( int row = 0; row < newArray.length - 1; row++){
      for (int col = 0; col < newArray.length - 1 - row; col++){
          if (newArray[col] > newArray[col + 1]){
          
 int temp = newArray[row];
 newArray[row] = newArray[col + 1];
 newArray[col + 1] = temp;

                        }

         }
 
    }







     return newArray;
     }
  }