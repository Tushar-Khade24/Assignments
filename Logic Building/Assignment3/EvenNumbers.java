import java.util.*;

public class EvenNumbers{

    static void CheckNum(){

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a Number");
      int n = sc.nextInt();
      int i = 1;

      while(i<=n){
               if (i % 2 == 0){
                    System.out.println(i);
              }

               i++ ; 
           }

        }


     public static void main (String args[]){

         EvenNumbers.CheckNum();
   }
}
