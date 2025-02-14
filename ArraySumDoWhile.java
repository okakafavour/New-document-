public class ArraySumDoWhile{

public static void main(String[] args){

int[] numbers = {1,2,3,4,5,6};

System.out.print(arrays(numbers));
 }
public static int arrays(int[] numbers){
int sum = 0;

for (int count = 0; count < numbers.length; count++){
  sum += numbers[count];

}
 return sum;

  }
}