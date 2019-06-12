package com.examples;

public class CTJava3test {
    public static void main(String args []) {

        // Timing first array runtime in nanoseconds

        final long startTime = System.currentTimeMillis();





        int Array[] = {10, 0, 5, 3, -19, 5};

        int Array1[] = {0, 1, 0, -127, 346, 125};



        // Finished timing the first array




        //Timing second array in nanoseconds

        System.out.println(containsDuplicates( Array1 ));

        final long endTime1 = System.currentTimeMillis();

        final long totalTime1 = endTime1 - startTime;

        System.out.println( "This Array1 took " + totalTime1 + " milliseconds to run" );



        System.out.println(containsDuplicates(Array));

        final long endTime = System.currentTimeMillis();

        final long totalTime = endTime - startTime;

        System.out.println( "This Array " + totalTime + " milliseconds to run");



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


