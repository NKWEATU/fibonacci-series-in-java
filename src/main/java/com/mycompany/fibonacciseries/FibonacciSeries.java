/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fibonacciseries;

/**
 *
 * @author USER
 */
public class FibonacciSeries {

    private static long[] FibonacciSeriesCache;
    
    public static void main(String[] args) {
        
        int n = 70; //once n =>93 it prints out negative values because long data types
                    //has its limit which is about 9 quintillioon
        FibonacciSeriesCache = new long [n + 1];
        
        //memoization in java is saving a particular result in a cache memory to be used
        //in the course of running a program
        for (int i = 0; i <= n; i++){
        System.out.println(FibonacciSeries(i) + " ");
        }
        
    }

    private static long FibonacciSeries(int n) {
        
        if(n <= 1){ // this is our base case to prevent infinite recursion
        return n;
        }
        if(FibonacciSeriesCache[n] != 0){
        return FibonacciSeriesCache[n];
        }
        
        long nthFibonacciSeriesNumber = (FibonacciSeries(n-1) + FibonacciSeries(n-2) );
        FibonacciSeriesCache[n] = nthFibonacciSeriesNumber;
        return nthFibonacciSeriesNumber;
   
    }
}
