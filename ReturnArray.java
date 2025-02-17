import java.util.Arrays;
  public class ReturnArray{
    public static void main(String[] args){

    String number = "2342";
    System.out.println(Arrays.toString(value(number)));

    }

   public static String[] value(String number){
   
   String[] result = new String[number.length()]; 
    
   for (int count = 0; count < number.length(); count++){
     result[count] = String.valueOf(number.charAt(count)); 
   

       }
      return result;
    }
  }