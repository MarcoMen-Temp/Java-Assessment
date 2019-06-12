/**
 * Program that returns the maximum element in an array Q.2 ( with Inline Comments )
 * Author : Marco Men
 * Computational Thinking And Algorithms
 * Last Changed : 15 March 2019
 */

package com.examples;

public class CTJava2 {
    public static void main ( String args[] ) {

        int inputArr[] = {0, -247, 341, 1001, 741, 22};

        System.out.print(finder(inputArr));


    }


    public static int finder ( int [] input ) {
        return finderRec( input, input.length - 1 );


    }

    // Binary Search below

    public static int finderRec(int[] input, int x)  {
        if(x == 0)  {
            return input[x];        // if the value of the integer in the array is 0, it will start the search
                                    // from the last element of the array ( x = input.length - 1 ) until there is only
                                    // one integer( input[0] )
                                    // The search will continue In this case until no more integers
                                    // in the array to to compare ( input[0] = 1 integer in the array)

        }

        int v1 = input[x];
        int v2 = finderRec(input,x-1);

        if(v1>v2)  {
            return v1;  // it returns the highest values either v1 or v2 and eliminates the lowest values
        }
        else {
            return v2;  // if there are two equal integers ( let's say the highest ),
                        // we will achieve the same result. The process of elimination grants v2 to be returned.
                        // Example: v1 = 1001 and v2 = 1001, v2 is returned
        }


    }
}
