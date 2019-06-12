package com.examples;


import static jdk.nashorn.internal.objects.Global.print;

public class Count {   // class 'rec1' is never used
    public void main ( ) {    // method 'main()' is never used

        count( 0 );

    }

    public void count ( int index ) {

        print( index );   // had to make an import above otherwise error

        if ( index < 2 ) {

            count( index + 1 );

        }

    }
}

