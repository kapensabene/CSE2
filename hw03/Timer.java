//Karli Pensabene
//hw03
//Timer Java Program
//
//  first compile the program
//      javac Timer.java
//  run the program
//      java Timer//

import java.util.Scanner; 

public class Timer {
    //main method required for every Java program 
    public static void main(String[] args) {
        
    Scanner myScanner = new Scanner (System.in);
    System.out.print("Enter the current time in the form HHMM: ");
    double currentTime = myScanner.nextDouble();
    System.out.print("Enter the time that you will be eating dinner: ");
    double dinnerTime = myScanner.nextDouble();
    
    
    double timeLeft;

   int hours, //whole number of hours
            minutes;
     timeLeft = dinnerTime - currentTime;
  
    //get the whole amount, dropping decimal fraction
   hours= (int)(timeLeft/100); 
    //get minutes amount, e.g.,
   
    minutes= (int)(((timeLeft/100) - hours) * 100) ;
    
    System.out.println("You have " + hours + " hours and " + minutes + " minutes until dinner."); 
    
}

}