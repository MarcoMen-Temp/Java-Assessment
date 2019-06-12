/**
 * Program to show the element values for "v1" and "v2"
 * before the maximum value is returned in Q.2
 * Author : Marco Men
 * Computational Thinking And Algorithms
 * Last Changed : 15 March 2019
 */

package com.examples;

public class CTJava2test1 {

    public static void main ( String args[] ) {

        int inputArr[] = {0, -247, 341, 1001, 741, 22};

        System.out.print(finder(inputArr));


    }


    public static int finder ( int [] input ) {
        return finderRec( input, input.length - 1 );


    }

    // Binary Search below where q is where x = 341 in the array

    public static int finderRec(int[] input, int x) {
        if ( x == 0 ) {
            return input[x];

        }

        int v1 = input[x];
        int v2 = finderRec( input, x - 1 );

        // The 2 code strings below will trace both variable positions in the array

        System.out.println("This is v1: " + v1);

        System.out.println("This is v2: " + v2);


        if ( v1 > v2 ) {
            return v1;
        } else {
            return v2;

            }

    }

}

