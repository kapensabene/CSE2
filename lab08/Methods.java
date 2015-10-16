//lab 08
//Methods Java Program
//
//  first compile the program
//      javac Methods.java
//  run the program
//      java MEthods//

import java.util.Scanner; 

public class Methods {

            
        public static double average (int n1, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10){
            return ((n1 +  n2 + n3 + n4 + n5 + n6 +  n7 + n8 + n9 + n10)/10);
        }
        
        public static double median (int n5, int n6) {
        return ((n6 + n5)/2.0);
        
        }
        
        public static void main (String [] args) {
          Scanner myScanner = new Scanner (System.in);

        System.out.println("Enter 10 integers");
        int n1 = myScanner.nextInt();
        int n2 = myScanner.nextInt();
        int n3 = myScanner.nextInt();
        int n4 = myScanner.nextInt();
        int n5 = myScanner.nextInt();
        int n6 = myScanner.nextInt();
        int n7 = myScanner.nextInt();
        int n8 = myScanner.nextInt();
        int n9 = myScanner.nextInt();
        int n10 = myScanner.nextInt();
        
        double a = average (n1, n2, n3, n4, n5, n6, n7, n8, n9, n10); 
        double b = median (n5, n6); 
        
        System.out.println("the median is: " + b);
        System.out.println("the average is: " + a);
        
         }
         
    }
    


