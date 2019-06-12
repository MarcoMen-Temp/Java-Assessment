package com.examples;

public class CTJava3test1 {

    public static void main(String args []) {

        // Timing first array runtime in nanoseconds

        final long startTime = System.nanoTime();




        int Array[] = {10, 0, 5, 3, -19, 5};



        containsDuplicates(Array);

        final long endTime = System.nanoTime();

        final long totalTime = endTime - startTime;

        System.out.println( "This Array " + totalTime + " milliseconds to run");

        // Finished timing the first array




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
