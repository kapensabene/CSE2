//lab 10
//Arrays Java Program
//
//  first compile the program
//      javac Arrays.java
//  run the program
//      java Arrays//

import java.util.Scanner; 

public class Arrays {
    
    public static void main(String[] args) {
    Scanner myScanner = new Scanner (System.in);
    System.out.println("enter an number of values");
    int n = myScanner.nextInt();
    
    int []nums= new int[n];
    int z= 0;
    double sum= 0;
    double average= 0;
    int i= 0;
    int numsGreater= 0;
    
    while (n > 100 || n < 0) {
        System.out.println("number is not between 0 and 100");
    }
    
    for (i=0; i < n; ++i){
        
    nums[i]=  (int)(Math.random()*100); 
    System.out.println(nums[i]);
    
    }
    
    for (z = 0; z < n; z++) {
    System.out.println("number added to sum: " + nums[z]);    
    sum +=nums[z];
    average = sum/(n);
   
    }
    
    System.out.println("The sum of the numbers is: " + sum );
    System.out.println("The average of the numbers is: " + average);
    
    for (z = 0; z <= n-1; z++) {
        if (nums[z] > average) {
        
    System.out.println("The numbers greater than the average are: " + nums[z]);
    
    }
    }
    
    
    }
}