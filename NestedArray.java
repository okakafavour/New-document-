import java.util.Arrays;
  public class NestedArray{
    public static void main(String[] args){
   int[][] array = {{1,2,3},{7,5,6,9}};

  
   for (int[] row : array){
     for (int count : row){

 System.out.print(count +" ");

          }

       } 
   }
}