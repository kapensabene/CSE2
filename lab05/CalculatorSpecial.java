//Karli Pensabene
//lab 05
//CalculatorSpecial Java Program
//
//  first compile the program
//      javac CalculatorSpecial.java
//  run the program
//      java CalculatorSpecial//

import java.util.Scanner; 

public class CalculatorSpecial {
    //main method required for every Java program 
    public static void main(String[] args) {
        
    Scanner myScanner = new Scanner (System.in);
    
    String Y = "y";
    while (!Y.equals("n")) {
    // System.out.print("Type n or N to stop: ");
    // Y = myScanner.next();
    System.out.print("Enter first integer: ");
    int firstInt = myScanner.nextInt();
    System.out.print("Enter second integer: ");
    int secondInt = myScanner.nextInt();
    System.out.print("Enter operator '*','-', '+', or '/':");
    String operator = myScanner.next();

    switch (operator) {
        case "*": 
            int multipulcation;
            multipulcation = firstInt * secondInt; 
            System.out.println("Answer is: "+multipulcation);
            break;
        case "+":
            int addition; 
            addition = firstInt + secondInt;
            System.out.println("Answer is: "+addition);
            break;
        case "/": 
            int division; 
            division = ((firstInt)/(secondInt));
            System.out.println("Answer is: "+division);
            break;
        case "-":
            int subtraction;
            subtraction = firstInt - secondInt; 
            System.out.println("Answer is: "+subtraction);
            break;
        default:
            System.out.println("Illegal Operator");
                }
        System.out.print("Type n to stop: ");
         Y = myScanner.next();
         }
    
          
    }
}