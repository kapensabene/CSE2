//lab 13
//Rectangle Java Program
//
//  first compile the program
//      javac Rectangle.java
//  run the program
//      java Rectangle//

import java.util.Scanner; 

public class Rectangle {
    double width; 
    double height; 
    
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner (System.in);
        
        Rectangle r1 = new Rectangle(); 
        r1.setHeight(5.3); 
        r1.setWidth(7.3);
        
        printline(r1); 
        
    }
    
    public static void printline(Rectangle r1) {
        System.out.println(r1.getArea());

    }
        
    public void setWidth(double w) {
        width = w; 
    
    }
    
    public void setHeight(double h) {
       height = h; 
    }
    
    public double getArea() {
        double area = height * width ; 
        return area;
    }
    
}