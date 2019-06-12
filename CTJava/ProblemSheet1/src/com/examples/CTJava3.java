/**
 * Program to show the runtimes in Nanoseconds of the 2 arrays given in Q.3.f)
 * Author : Marco Men
 * Computational Thinking And Algorithms
 * Last Changed : 15 March 2019
 */


package com.examples;

public class CTJava3 {
    public static void main(String args []) {

        // Timing first array runtime in nanoseconds

        final long startTime = System.nanoTime();

        int Array[] = {10, 0, 5, 3, -19, 5};

        int Array1[] = {0, 1, 0, -127, 346, 125};

        System.out.println(containsDuplicates(Array));

        final long endTime = System.nanoTime();

        final long totalTime = endTime - startTime;

        System.out.println( "The Array list takes " + totalTime + " nanoseconds as runtime");

        // Finished timing the first array



        //Timing second array in nanoseconds

        final long startTime1 = System.nanoTime();

        System.out.println(containsDuplicates( Array1 ));

        final long endTime1 = System.nanoTime();

        final long totalTime1 = endTime1 - startTime1;

        System.out.println( "The Array1 list takes " + totalTime1 + " nanoseconds as runtime" );

    }
    public static boolean containsDuplicates ( int elements[] ) {
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                if ( i == j ) {
                    continue;
                }
                if ( elements[i] == elements[j] ) {
                    return true;
                }
            }
        }
        return false;
    }

}

