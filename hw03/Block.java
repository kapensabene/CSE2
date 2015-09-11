//Karli Pensabene
//hw03
//Block Java Program
//
//  first compile the program
//      javac Block.java
//  run the program
//      java Block//

import java.util.Scanner; 

public class Block {
    //main method required for every Java program 
    public static void main(String[] args) {
    
    //prompt user to enter height, length, and width 
    Scanner myScanner = new Scanner (System.in);
    System.out.print("Enter the length of the block : ");
    double length = myScanner.nextDouble();
    System.out.print("Enter the width of the block: ");
    double width = myScanner.nextDouble();
    System.out.print("Enter the height of the block: ");
    double height = myScanner.nextDouble();
    
    double volume;
    double surfaceArea; 

   volume = (length * height * width);
   surfaceArea = ((2 *(height * width)) + (2 *(height * length)) + (2 *(width * length)));
    
    System.out.println("The volume of the block of dimensions " + length + " x " + width + " x " + height + " is " + volume);
    System.out.println("The surface area of the block is " + surfaceArea);
    
        
    }

}