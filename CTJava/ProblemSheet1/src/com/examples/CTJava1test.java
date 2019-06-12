/**
 * Program to show the Stack Trace Call of recursive method in Q.1
 * Author : Marco Men
 * Computational Thinking And Algorithms
 * Last Changed : 15 March 2019
 */

package com.examples;

public class CTJava1test {

    // Method call
    public static void main ( String args[] ) {


        mystery( 1 ); // it returns the first element in the series
    }


    // Arguments for objects in method
    public static void mystery ( int n ) {

        /**Stack Trace Code Adapted From:
         * " http://www.benmccann.com/printing-a-stack-trace-anywhere-in-java/ "
         */

        // Call Stack Trace for 'n' values
        System.out.println("Call Stack Trace:");
        System.out.println( "n =  " + n );  // prints it
        if ( n < 4 ) {

            StackTraceElement[] cause = Thread.currentThread().getStackTrace();

            mystery( n + 1 );
            StackTraceElement s = cause[n];
            System.out.println("\tat " + s.getClassName() + "." +s.getMethodName() + "(" + s.getFileName() +":" +
                    s.getLineNumber() + ")");
        }

        // Call Stack Trace for 'n' values returning to caller - LIFO method
        System.out.println("Stack Trace Return To Caller:");
        System.out.println( "n =  " + n );
    }
}



