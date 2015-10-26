//lab 09
//flip Java Program
//
//  first compile the program
//      javac flip.java
//  run the program
//      java flip//

import java.util.Scanner; 

public class flip {
    public static void main(String[] args) {
       //Accept an int input from Scanner
        Scanner myScanner = new Scanner (System.in);
        System.out.println("input an integer between 0 and 100");
        int n = myScanner.nextInt();
        if (n == 0){
        flip ();
        }
        else{
        flip(n);
        }
        //int totalHeads;
        //int totalTails;

 
       //Call flip() if input is zero
       //call flip(n) if not
       //n = scnnaer.nextInt() {n will be 5}
       //flip(n) and 5 will to this method
}
    public static void flip() {
        int totalHeads = 0;
        int totalTails = 0;
       
        
        if (Math.random() < 0.5) {
        totalHeads = 1;
        }
        else {                   
        totalTails = 1;
        
        
        }
        
       System.out.println("total heads: " + totalHeads);
       System.out.println("total tails: " + totalTails);
        }

    public static void flip(int n) {
        //accepts an int (i.e. 5) 
        //Call flip 5 tips for each separate coin flip
        //Print out the total amount of heards and tails
        int heads = 0;
        int totalHeads = 0;
        int totalTails = 0;
        int tails = 0;
        
        for (int i=1; i <= n; i++) {
        
        if (Math.random() < 0.5) {
        totalTails+=1; 
        }
        
        else {                   
        totalHeads+=1;
        }

        }       
       System.out.println("total heads: " + totalHeads);
       System.out.println("total tails: " + totalTails);

    }

}
