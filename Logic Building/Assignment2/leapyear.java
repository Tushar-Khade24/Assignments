//Write a java program that checks whether the year is leap or not

public class leapyear{
   public static void main (String args[]){
       
      int year = 2024 ;
        if ( year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ){
           System.out.println(year + "is Leap year");
           }
        else {
           System.out.println(year + " is Not leap year");
           }
    }     
}


// output :  2024 is Leap year