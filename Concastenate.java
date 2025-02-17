import java.util.Arrays;
  public class Concastenate{
    public static void main(String[] args){
    
   String[][] array = {{"a","b","c"},{"1","2","3"}};
   System.out.println(Arrays.toString(numbers(array)));
  }
 public static String[] numbers(String[][] array){
  
  int totalElement = 0;

  for (String[] row : array){
     totalElement += row.length;
   
 }
   String[] newArray = new String[totalElement];
   int index = 0;

  for (int count = 0; count < array.length; count++){
      for (int counter = 0; counter < array[count].length; counter++){
         newArray[index++] = array[count][counter];       

       }
     }
    return newArray;
  }
}