//Karli Pensabene
//hw06
//Pyramid Java Program
//
//  first compile the program
//      javac pyramid.java
//  run the program
//      java pyramid//

import java.util.Scanner; 

public class pyramid {
    //main method required for every Java program 
    public static void main(String[] args) {
        
    Scanner myScanner = new Scanner (System.in);
    
    System.out.println("What size pyramid? (1-10) ");
    int pyramidSize = myScanner.nextInt();
    
    switch (pyramidSize) {
        case 1: 
            System.out.println("*");
            break;
        case 2: 
            System.out.println(" *");
            System.out.println("***");
            break;
        case 3: 
            System.out.println("  *") ;
            System.out.println(" ***");
            System.out.println("*****");
            break;
        case 4:
            System.out.println("   *");
            System.out.println("  ***");
            System.out.println(" *****");
            System.out.println("*******");
            break;
        case 5:
            System.out.println("    *");
            System.out.println("   ***");
            System.out.println("  *****");
            System.out.println(" *******");
            System.out.println("*********");
            break;
        case 6:
            System.out.println("     *");
            System.out.println("    ***");
            System.out.println("   *****");
            System.out.println("  *******");
            System.out.println(" *********");
            System.out.println("***********");
            break;
        case 7:
            System.out.println("      *");
            System.out.println("     ***");
            System.out.println("    *****");
            System.out.println("   *******");
            System.out.println("  *********");
            System.out.println(" ***********");
            System.out.println("*************");
            break;
        case 9:
            System.out.println("        *");
            System.out.println("       ***");
            System.out.println("      *****");
            System.out.println("     *******");
            System.out.println("    *********");
            System.out.println("   ***********");
            System.out.println("  *************");
            System.out.println(" ***************");
            break;
        case 10:
            System.out.println("        *");
            System.out.println("       ***");
            System.out.println("      *****");
            System.out.println("     *******");
            System.out.println("    *********");
            System.out.println("   ***********");
            System.out.println("  *************");
            System.out.println(" ***************");
            System.out.println("*****************");
            break;
        default:
            System.out.println("Illegal Integer");
            
         }
    }
}
    