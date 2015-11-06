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
        int k = 0;
        
        
    for (i=0; i < 20; i++){
         array1[i]=  (int)(Math.random()*100); 
    }
    Sorting(array1, array2);
    
    for (j=0; j < 10; ++j){
        array2[j]=  (int)(Math.random()*100); 
    }
     Sorting(array1, array2);
    
    for (k=0; k < (array1.length + array2.length); k++) {
        int [] array3 = {array1, array2};
        //Sorting(array3);
    }
    
    for (i=0; i<array1.length; i++) {
        System.out.println(array1[i]);
    }
    
    for (j=0; j<array2.length; j++) {
        System.out.println(array2[j]);
    }
    //for (k=0; k<array3.length; k++) {
     //   System.out.println(array3[k]);
    //}
    
}
    
    public static void Sorting(int[] array1, int[] array2) { 
        
    Arrays.sort(array1);
    Arrays.sort(array2);
    //Arrays.sort(array3);
    }
}

        
    
     
