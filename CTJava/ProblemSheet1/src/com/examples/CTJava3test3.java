/**
 * Program to show the comparisons( element values for "i" and "j" iterations)
 * before the duplicates are found of the arrays  given in Q.3.f)
 * Author : Marco Men
 * Computational Thinking And Algorithms
 * Last Changed : 15 March 2019
 */

package com.examples;

public class CTJava3test3 {

    public static void main ( String args[] ) {

        int Array[] = {10, 0, 5, 3, -19, 5};

        int Array1[] = {0, 1, 0, -127, 346, 125};

        // Adapted from : " http://tutorials.jenkov.com/java/arrays.html "

        System.out.println("The iteration of 'i' and 'j' on the Array: \n");
        containsDuplicates( Array );

        System.out.print("\n\n");       // Give a couple of blank lines

        System.out.println("The iteration of 'i' and 'j' on the Array1: \n ");
        containsDuplicates( Array1 );

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

                    System.out.println( "elements[i]: " + elements[i] + ", elements[j]: " + elements[j]);

            }


            }
            return false;
        }

}


