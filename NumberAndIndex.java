import java.util.Arrays;
public class NumberAndIndex {
 public static void main(String[] args) {
int[] array = { 10, 20, 30, 40, 60};

System.out.printf("%s%8s%n","index", "Value");

for (int count = 0; count < array.length; count++) {
  System.out.printf("%5d%8d%n", count, array[count]);

    }
  }


}