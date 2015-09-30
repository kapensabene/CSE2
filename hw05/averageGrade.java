//Karli Pensabene
//hw 05
//Average Grade Program
//
//  first compile the program
//      javac averageGrade.java
//  run the program
//      java averageGrade//

import java.util.Scanner; 

public class averageGrade {
    //main method required for every Java program 
    public static void main(String[] args) {
        
    Scanner myScanner = new Scanner (System.in);
    
    int totalGrade = 0;         //initialize totalGrade and numGrades
    int numGrades = 0;
    
    //if string doesnt equal y (999) then continue with while statement
    String Y = "y";
    while (!Y.equals("999")) {
        
    //enter grade
    System.out.print("Enter grade: ");
    int grade = myScanner.nextInt();    //initialize grade as integer to be scanned

  
    //if grade is greater than 0 or less than 100
    if (grade >= 0 || grade <= 100) {
           
            //int n = 0
            //int g = 0;
            numGrades ++;
            totalGrade = totalGrade + grade;
            
    //if grade is less than 0 or greater than 100
    } else if (grade < 0 || grade > 100) {
        //grade calculator will not work because illegal number
            System.out.println("Illegal Number");
        //for any other input, illegal input
    } else {
        System.out.println ("Illegal input");
        
    }
    
    //if use types 999, program stops
       System.out.print("Type 999 to stop: ");
         Y = myScanner.next();
         
    }
    //print average grade at end of program
    int averageGrade = 0;
    averageGrade = (totalGrade) / (numGrades);
    System.out.println("average Grade is: " + averageGrade);
       
          
    }
}