//Karli Pensabene
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
        
        //user enters size of array and number of mines
        System.out.println("Please enter a size of array between 2 and 30");
        int N = myScanner.nextInt();
        System.out.println("Please enter number of mines to be placed on board");
        int M = myScanner.nextInt();
        
        //array mine is a square with side length N
        int[][] mine = new int[N][N];

        
        //for the number of mines there are, generate random locations for the mine in the place of
        //c and r (column and row)
        for (int i = 0; i < M; i++) {
            int r= (int)(Math.random()*N);
            int c= (int)(Math.random()*N);
            
            //if there i a mine, loop back to top
            if (mine[r][c] == 8) {
                i = i-1; 
            }
            
            //else, increment how many mines are adjacent to spot
            //go through each position for r and c, and increment where there is a mine adjacent
            else {
                mine[r][c] = 8;
                if(c!=N-1) {
                    if (r != N-1) {
                        if(mine[r+1][c+1]!= 8) {
                            mine[r+1][c+1]++;
                        }
                    }
                    if(mine[r][c+1]!= 8) {
                        mine[r][c+1]++;
                    }
                    if (r != 0) {
                        if(mine[r-1][c+1]!= 8) {
                            mine[r-1][c+1]++;
                        }
                    }
                }
                if(r!=N-1) {
                    if(mine[r+1][c]!= 8) {
                        mine[r+1][c]++;
                    }
                    
                    if(c!=0) {
                        if(mine[r+1][c-1]!= 8) {
                            mine[r+1][c-1]++;
                        }
                    }
                }
                if(c!=0) {
                    if(mine[r][c-1]!= 8) {
                        mine[r][c-1]++;
                    }
                    if (r != 0) {
                        if(mine[r-1][c-1]!= 8) {
                            mine[r-1][c-1]++;
                        }
                    }
                }
                if(r!=0) {
                    if(mine[r-1][c]!= 8) {
                        mine[r-1][c]++;
                    }
                }
            }
            
        }
            //print for loop
            //where there is an 8, change it to an M 
            for(int i = 0; i < N; i++) {
                for(int r=0; r<N; r++){
                    if (mine[i][r] == 8) {
                        System.out.print("M");
                    }
                    else 
                    //print array
                        System.out.print(""+mine[i][r]);
                }
                System.out.println();
                }
            }
    }