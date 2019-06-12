/**
 * Program to show the runtimes in Nanoseconds of the iterative method
 * Author : Marco Men
 * Computational Thinking And Algorithms
 * Last Changed : 15 March 2019
 */

package com.examples;

public class CTJava2test3 {


        static int inputArr[] = {0, -247, 341, 1001, 741, 22};

        static int highest () {
            int x;
            int v2 = inputArr[0];
            for (x = 1; x < inputArr.length; x++)
                if ( inputArr[x] > v2 )
                    v2 = inputArr[x];
            return v2;

        }

        public static void main (String args [] ) {

            final long startTime = System.nanoTime();

            System.out.println(highest());


            final long endTime1 = System.nanoTime();

            final long totalTime1 = endTime1 - startTime;

            System.out.println( "Using the iteration method takes " + totalTime1 + " nanoseconds to run" );

        }
    }


