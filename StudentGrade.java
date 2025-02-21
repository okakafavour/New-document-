import java.util.Arrays;
import java.util.Scanner;
 public class StudentGrade{
   public static void main(String... args){

   Scanner input = new Scanner(System.in);

   System.out.println("How many students do we have: ");
   int studentNumber = input.nextInt();

   System.out.println("How many subject do they offer: ");
   int subjects = input.nextInt();

   System.out.println();

  int[][] scores = new int[studentNumber][subjects];

  for (int count = 1; count <= studentNumber; count++){
      System.out.println("Enter score for student" + " " + count);
    for (int counter = 1; counter <= subjects; counter++){
    System.out.println("Enter the score for subject" + " " + counter);
      int userinput = input.nextInt();
      

      System.out.println("""
Saving >>>>>>>>>>>>>>>>>>>
Saving successfully
""");  

         }
 System.out.println();
       }

  for (int row = 1; row <= studentNumber; row++){
  int totalNumber = 0;
   
 System.out.println("========================================");

System.out.print("STUDENTS" + " ");

for (int count = 1; count <= subjects; count++){
 System.out.print("SUB" + count + " ");
 }
 
  System.out.print("TOT" + " " + "AVE" + " " + "POS");  

 System.out.println();
 System.out.println("========================================");

 System.out.print("Student" + count);
 
      }
    }
 }
     

 