//Karli Pensabene
//lab 04
//Calculator Java Program
//
//  first compile the program
//      javac Check.java
//  run the program
//      java Check//

import java.util.Scanner; 

public class Calculator {
    //main method required for every Java program 
    public static void main(String[] args) {
        
    Scanner myScanner = new Scanner (System.in);
    
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
    }
}