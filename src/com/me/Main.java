package com.me;
//https://www.geeksforgeeks.org/remove-element-arraylist-java/


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(1);
        al.add(2);

        System.out.println("Original ArrayList : " + al);

        System.out.println("-----------------------------------------");

        // This makes a call to remove(int) and
        // removes element 20.
        al.remove(1);

        // Now element 30 is moved one position back
        // So element 30 is removed this time
        al.remove(1);

        System.out.println("Modified ArrayList : " + al);

        System.out.println("-----------------------------------------");

        //since element 1 became position 1, it will be nixed
        al.remove(1);

        System.out.println("Further Modified ArrayList : " + al);

        System.out.println("-----------------------------------------");

        //since element 2 became position 1, it will be nixed
        al.remove(1);

        System.out.println("And still Further Modified ArrayList : " + al);

    }

}

/*results;
Original ArrayList : [10, 20, 30, 1, 2]
-----------------------------------------
Modified ArrayList : [10, 1, 2]
-----------------------------------------
Further Modified ArrayList : [10, 2]
-----------------------------------------
And still Further Modified ArrayList : [10]
 */
