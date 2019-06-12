package com.examples;



public class rec {


    public static void main ( String args[] ) {

        final long startTime = System.nanoTime();       // Run times in nanoseconds, if I wanted in Milliseconds
                                                        // I would use the method described in:
                                                        // " https://stackoverflow.com/questions/3382954/measure-
                                                        // execution-time-for-a-java-method "
        count( 0 );

        final long endTime = System.nanoTime();

        final long totalTime = endTime - startTime;

        System.out.println( totalTime );

    }

      public static void count ( int index ){
            System.out.print( index );
            if ( index < 2 ) {
                count( index + 1 );


     
     

            }

        }
    }









