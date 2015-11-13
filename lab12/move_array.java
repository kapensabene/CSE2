//lab 12
//Arrays Java Program
//
//  first compile the program
//      javac move_arrays.java
//  run the program
//      java move_arrays//

import java.util.Scanner; 

public class move_array {
    
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner (System.in);
        System.out.println("enter the size for the array");
        int n = myScanner.nextInt();
        int[] array;
        try { 
            array= new int[n];
        }
        catch (Exception e) {
            System.out.println("size must be greater than 0");
                while (n < 0) {
                    System.out.println("enter a size greater than 0: ");
                     n = myScanner.nextInt();
                }
                array = new int[n];
        }
        

        
        for (int i=0; i < n; ++i){
            
            array[i]=  (int)(Math.random()*100); 
            System.out.println(array[i]);
           
        
        }
        System.out.println();
        
        System.out.println("enter the index to be moved");
        int index = myScanner.nextInt(); 
       
        //if (index > 0 && index < array.length) {
            int tmp = 0;
            try {
                tmp = array[index];
            } catch (Exception e) {
                System.out.println("Number is not within array length");
                while (index >= array.length) {
                    System.out.println("Enter a new Integer: ");
                    index = myScanner.nextInt();
                }
                tmp = array[index];
            }
            if (index < n) {
                for (int i = index; i < n-1; i++) {
                    array[i] = array[i+1] ;
                }
                
            }
            else { 
                for (int i = index; i > n; i--) {
                    array[i] = array[i-1];
                }
            }
     
            array[n-1] = tmp;
        //}
        for (int k= 0 ; k < n; k++) { 
           
            System.out.println(array[k]);
        }
        
        
    }
}