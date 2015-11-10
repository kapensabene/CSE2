//hw 10
//MineSweeper Java Program
//
//  first compile the program
//      javac MineSweeper.java
//  run the program
//      java MineSweeper//

import java.util.Arrays; 

import java.util.Scanner;

public class MineSweeper {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner (System.in);
     
        System.out.println("Please enter a size of array between 2 and 30");
        int N = myScanner.nextInt();
        System.out.println("Please enter number of mines to be placed on board");
        int M = myScanner.nextInt();
        int[][] mine = new int[N][N];
        int column = N;
        int row = N; 
        
        
        
        for (int i = 0; i < M; i++) {
            int x= (int)(Math.random()*N);
            int y= (int)(Math.random()*N);
            //if there is a mine, loop back to top
            if (mine[x][y] == M) {
                i = i-1; 
            }
            //else, increment how many mines are adjacent to spot
            else { 
                mine[x][y] = "X";
                
                if(y!=N-1) {
                    if(mine[x+1][y+1]!= "X") {
                        mine[x+1][y+1]++;
                    }
                    if(mine[x][y+1]!= "X") {
                        mine[x][y+1]++;
                    }
                    if(mine[x-1][y+1]!= "X") {
                        mine[x-1][y+1]++;
                    }
                }
                if(x!=N-1) {
                    if(mine[x+1][y]!= "X") {
                        mine[x+1][y]++;
                    }
                    
                    if(y!=0) {
                        if(mine[x+1][y-1]!= "X") {
                            mine[x+1][y-1]++;
                        }
                    }
                }
                if(y!=0) {
                    if(mine[x][y-1]!= "X") {
                        mine[x][y-1]++;
                    }
                    if(mine[x-1][y-1]!= "X") {
                        mine[x-1][y-1]++;
                    }
                }
                if(x!=0) {
                    if(mine[x-1][y]!= "X") {
                        mine[x-1][y]++;
                    }
                }
            }
            
        }
            
            for(int i = 0; i < N; i++) {
                for(int x=0; x<N; x++){
                    System.out.print(""+mine[i][x]);
                }
                System.out.println();
                }
            }
    }