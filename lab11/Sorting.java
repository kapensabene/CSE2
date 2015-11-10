//lab 11
//Sorting Java Program
//
//  first compile the program
//      javac Sorting.java
//  run the program
//      java Sorting//

import java.util.Arrays; 

public class Sorting {
     public static void main(String[] args) {
        int[] array1 = new int[20];
        int i = 0; 
        int[] array2 = new int[10];
        int j = 0;
        int[] array3 = new int[30];
        int k = 0;
        
        
    for (i=0; i < 20; i++){
         array1[i]=  (int)(Math.random()*100); 
    }
    Sorting(array1, array2, array3);
    
    for (j=0; j < 10; ++j){
        array2[j]=  (int)(Math.random()*100); 
    }
     Sorting(array1, array2, array3);
     
    for(k= 0; k<30; k++){
        if(k<20){
                array3[k] = array1[k];
            }
            else {
                array3[k] = array2[k-20];
            }
        }
    Sorting(array1, array2, array3);
    
    for (i=0; i<array1.length; i++) {
        System.out.println(array1[i]);
    }
    System.out.println();
    System.out.println();
    
    for (j=0; j<array2.length; j++) {
        System.out.println(array2[j]);
    }
    System.out.println();
    System.out.println();
    
    for (k=0; k<array3.length; k++) {
        System.out.println(array3[k]);
    }
    System.out.println();
    System.out.println();
    
}
    
    public static void Sorting(int[] array1, int[] array2, int[] array3) { 
        
    Arrays.sort(array1);
    Arrays.sort(array2);
    Arrays.sort(array3);

    }
}

        
    
     
