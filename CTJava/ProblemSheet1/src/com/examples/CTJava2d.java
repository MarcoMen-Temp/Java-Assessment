/**
 * Program to show the iterative method of the maximum element return of an array in Q.2.d)
 * Author : Marco Men
 * Computational Thinking And Algorithms
 * Last Changed : 15 March 2019
 */

package com.examples;

    /** Adapted from GeekForGeeks:
" https://www.geeksforgeeks.org/java-program-for-program-to-find-largest-element-in-an-array/ "
     */

    public class CTJava2d {

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

            System.out.println(highest());


        }
    }





















