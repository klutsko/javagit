package hw9;

import javax.jws.Oneway;

public class Exceptions {
    public static void main(String[] args) {

        //ArrayIndexOutOfBoundsException= RuntimeException = we don't need to use try/catch here

        String[] myFirstStringArray = new String[]{"String 1", "String 2",
                "String 3"};


        for (int i = 0; i < myFirstStringArray.length; i++) {
            if (i >= myFirstStringArray.length) {
                System.out.println("Index is bigger than array length");
                myFirstStringArray[i] = null;
            } else {
                System.out.println("Array is " + myFirstStringArray[i]);

            }
        }

        //NullPointerException = RuntimeException = we don't need to use try/catch here

        Integer num = null;

        if (num != null) {
            System.out.println(num);

        } else {
            System.out.println("Num is null");
        }


        //ClassCastException = RuntimeException = we don't need to use try/catch here =>

        int a = 44;
        long b = a;

        if (a == b) {
            System.out.println(a);
        } else {
            System.out.println("You cannot cast this way");
        }


        //NumberFormatException = RuntimeException = we don't need to use try/catch here


        String s = "HJH";
        Object o = s;
        System.out.println(isFormatCorrect(s, o));


    }

    static boolean isFormatCorrect(String s, Object o) {
        if (o.equals(s)) {
            System.out.println("Correct");
        } else {
            System.out.println("Format isn't correct");
        }
        return true;

    }


}




























