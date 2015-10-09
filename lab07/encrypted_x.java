//Karli Pensabene
//lab 07
//Encrypted X Java Program
//
//  first compile the program
//      javac encrypted_x.java
//  run the program
//      java encrypted_x//

import java.util.Scanner; 

public class encrypted_x {
    //main method required for every Java program 
    public static void main(String[] args) {
        
    Scanner myScanner = new Scanner (System.in);
    System.out.println("Enter integer between 0 and 100: ");
    int sizeSquare = myScanner.nextInt();
    
    if (sizeSquare > 0 || sizeSquare < 100) {
     
       for (int i = 0; i < sizeSquare; i++) {
           
          for (int j = 0; j < sizeSquare; j++) {
              
            if (i==j) {
              System.out.print(" ");
                }
                 else if (sizeSquare - j == i + 1) {
              System.out.print(" ");
              
                }
                
                else {
              System.out.print("*");
                }
          
          
    }
        System.out.println();
       }
    }
    else { System.exit(-1); 
    }
    
      
      }
}