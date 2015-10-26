import java.util.Scanner; 

public class area {
    
    public static void main(String [] args) {
        Scanner myScanner = new Scanner (System.in); 
        System.out.println("Please enter 1 for circle, 2 for rectangle, 3 for trapezoid, X to exit: ");
        int shape = myScanner.nextInt();
        double r = 0.0;
        int w = 0;
        int l = 0;
        int b1 = 0;
        int b2 = 0;
        int h = 0;
        double shapeArea = 0.0;
        int sArea = 0;
        
while (shape == 1 || shape == 2 || shape == 3)  {      
    
    if (shape == 1) {
        System.out.println("Please enter radius: "); 
        r = myScanner.nextInt();
        shapeArea = area(r);
        System.out.println("area is: " + shapeArea);
    }
    else if (shape == 2) {
        
        System.out.println("Please enter width: ");
        w = myScanner.nextInt();
        System.out.println("Please enter length: ");
        l = myScanner.nextInt();
        sArea = area(l, w);
        System.out.println("area is: " + sArea);
    }
    else if (shape == 3) {
        System.out.println("Please enter base 1: ");
        b1 = myScanner.nextInt();
        System.out.println("Please enter base 2: ");
        b2 = myScanner.nextInt();
        System.out.println("Please enter height: ");
        h = myScanner.nextInt();
        sArea = area(b1,b2,h);
                System.out.println("area is: " + sArea);
    }

    System.out.println("Please enter 1 for circle, 2 for rectangle, 3 for trapezoid, X to exit: ");
    shape = myScanner.nextInt();
    
}
    }
    
    
    public static double area(double r) {

        double circleArea = 3.14 * Math.pow(r,2);
        return circleArea;
    }
    public static int area(int l, int w) {
        
        int rectArea = l * w; 
        return rectArea;
    }
    public static int area(int b1, int b2, int h) {

        int trapArea = ((b1 + b2) * (h/2));
        return trapArea;
    }
    
     //double c = area (int b1, int b2, int h);
        
    
    
    
    }
    
