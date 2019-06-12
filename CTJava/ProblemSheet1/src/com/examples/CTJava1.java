/**
 * Program to show the recursive method ( Q.1 )
 * Author : Marco Men
 * Computational Thinking And Algorithms
 * Last Changed : 15 March 2019
 */

package com.examples;

public abstract class CTJava1 {

    // Method call
    public static void main ( String args[] ) {


        mystery( 1 ); // it returns the first element in the series
    }


    // Arguments for objects in method
    public static void mystery ( int n ) {
        System.out.println( n );  // prints it
        if ( n < 4 ) {
            // if condition is true, it jumps to the next element by adding 1 to n
            mystery( n + 1 );   // keeps adding until n = 4, prints it and exits(condition no longer satisfied)

        }
        System.out.println( n ); // prints n and reverts back to caller ( n =1 ) before exiting
    }
}



