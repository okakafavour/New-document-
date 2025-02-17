public class SortingArray{
  public static void main(String[] args){

  int[] array = {1,2,6,7,4,3,9};
  System.out.println(numbers(array));
   }
  public static int numbers(int[] array){
  int size = 7;
  int result = 0; 
  for (int count = 0; count < array; count++){
     for (int counter = 0; counter < array[count]; count++){
         
    int value1 = count + 1;
    int value2 = array[counter];
    int value3 = array[value1];
 
   if ( value3 < value2){

     int temp1 = value1;
     int temp2 = value2;

    array[counter] = value3;
    array[value1] = counter; 

             } 
      
          }

       } 
       for (int tem = 0; tem < size; tem++){
          result += array[tem];
        }
   return result;
    }
 }