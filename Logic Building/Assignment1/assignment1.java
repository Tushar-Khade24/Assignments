public class assignment1{
       public static void main(String[] args){
           // positive and negative number using if-else
           int a = 10;
           if(a>=0){
             System.out.println("Positive Number");
           }else{
             System.out.println("Negative Number");
           }
           
          // Number is odd or even
           int b = 14;
           if (b % 2 == 0 ){
                System.out.println("Even number");
              }else{
                System.out.println("Odd number");
              }

          // Display Good morning message if the time is between 5AM to 12PM
           
            int time = 6 ;
            if(time>= 5 && time<=12){
                System.out.println("Good Morning");
             }else{
                System.out.println("Error");
             } 

          // Area of square
    
            int side = 16;
            int area = side * side;
            System.out.println(area);

         // Area of rectangle
             
            int length = 13;
            int breadth = 15;
            int AreaofRectangle = length * breadth;
            System.out.println(AreaofRectangle);  
   
         //Largest number

            int r = 7;
            int v = 45;
            int m = 18;

            if (r >= v && r >= m) {
            System.out.println("Largest number = " + r);
              } 
            else if (v >= r && v >= m) {
            System.out.println("Largest number = " + v);
              } 
            else {
            System.out.println("Largest number = " + m);
              }
  }
}