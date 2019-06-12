/**
 * Program to count the number of comparisons of the arrays given in Q.3.f)
 * Author : Marco Men
 * Computational Thinking And Algorithms
 * Last Changed : 15 March 2019
 */

package com.examples;

public class CTjava3c {

    public static void main(String args []) {

        int Array[] = {10, 0, 5, 3, -19, 5};

        int Array1[] = {0, 1, 0, -127, 346, 125};

        System.out.println( containsDuplicates( Array ) );        // 4 comparisons

        System.out.println( "The number of comparisons in Array before a duplicate is found is " + compare );

        compare = 0;    // reset comparator to 0 after first array comparison
                        // before starting the second array comparison

        System.out.println(containsDuplicates( Array1 ));       // 2 comparisons

        System.out.println("The number of comparisons in Array1 before a duplicate is found is " + compare);

    }

    public static int compare = 0;


    public static boolean containsDuplicates ( int elements[] ) {

        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                compare ++;

                if ( i == j ) {
                    compare--;      //eliminate the self comparison count

                    continue;

                }
                if ( elements[i] == elements[j] ) {     // includes the last comparison,
                                                        // where the duplicates are found

                    return true;

                }

            }

        }

        return false;
    }

}

