import java.util.*;

    public class PositiveNum{

         static void Num(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a num ");
            int i ;

            do{

             System.out.println("Enter a Positive Number");
             i = sc.nextInt();
              

             }while(i <= 0);
            System.out.println("You enter a positive num " + i);
        }

    public static void main (String args[]){  

           PositiveNum.Num();
 
    }
}