

import java.util.Arrays;
  public class AddArray{
   public static void main(String[] args){
     int[][] array = {{1,2,3}, {4,5,6}};
    System.out.println(Arrays.toString(numbers(array)));

  }
  public static int[] numbers(int[][] array){
   int totalElement = 0; 

 // calculate the total Number of the elements
    for (int[] row : array){   // used nested for loop to loop through a 2d aray
      totalElement += row.length;
  }
   
    int[] newArray = new int[totalElement]; // creat a 1d array
    int index = 0; 

  for (int count = 0; count < array.length; count++){
        for (int counter = 0; counter < array[count].length; counter++){
              newArray[index++] += array[count][counter]; // store the value
 
           }

      }
   return newArray;
   }
   
}