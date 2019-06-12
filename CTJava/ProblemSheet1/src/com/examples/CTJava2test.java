/**
 * Program to show the runtimes in Nanoseconds of the recursive method
 * Author : Marco Men
 * Computational Thinking And Algorithms
 * Last Changed : 15 March 2019
 */

package com.examples;

public class CTJava2test {
    public static void main ( String args[] ) {

        // Timing  array runtime in nanoseconds

        final long startTime = System.nanoTime();

        int inputArr[] = {0, -247, 341, 1001, 741, 22};

        System.out.println(finder(inputArr));

        final long endTime = System.nanoTime();

        final long totalTime = endTime - startTime;

        System.out.println( "Using Recursion method takes " + totalTime + " nanoseconds to run");

        // Finished timing the  array
    }


    public static int finder ( int [] input ) {
        return finderRec( input, input.length - 1 );

    }

    public static int finderRec(int[] input, int x)  {
        if(x == 0)  {
            return input[x];

        }

        int v1 = input[x];
        int v2 = finderRec(input,x-1);


        if(v1>v2)  {
            return v1;

        }
        else {
            return v2;

        }

    }
}

