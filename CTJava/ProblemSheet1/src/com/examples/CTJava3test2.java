package com.examples;

public class CTJava3test2 {

    public static void main(String args []) {

        // Timing first array runtime in nanoseconds

        final long startTime = System.nanoTime();


        int Array1[] = {0, 1, 0, -127, 346, 125};




        //Timing second array in nanosecondss

        containsDuplicates( Array1 );

        final long endTime1 = System.nanoTime();

        final long totalTime1 = endTime1 - startTime;

        System.out.println( "This Array1 took " + totalTime1 + " milliseconds to run" );



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
