import java.util.*;

public class AgeChecker{

      static void Age (){

         Scanner sc = new Scanner (System.in);
         System.out.println("Enter your age : ");
         int age = sc.nextInt();
         
         if(age < 18){
                    System.out.println("You are a Minor");
             }

         else if (age > 18 && age < 58){
                   System.out.println("You are an Adult");
             }


        else {
                   System.out.println("You are a Senior citizen");
             }


        }
      public static void main (String args[]){
              AgeChecker.Age();

   }

}