package hw9;

public class Exceptions {
    public static void main(String[] args) {

        //ClassCastException = RuntimeException = we don't need to use try/catch here =>
        // need to change String to Integer

        Object x = new Integer(0);
        System.out.println((String) x);

        //NullPointerException = RuntimeException = we don't need to use try/catch here
        // don't need to call null object
        Integer num=null;
        num.hashCode();

        //NumberFormatException = RuntimeException = we don't need to use try/catch here
        //don't need to parse String to int
        String s ="Hello";
        int i = Integer.parseInt(s);

        //ArrayIndexOutOfBoundsException= RuntimeException = we don't need to use try/catch here
        // don't need to call arr[5]
        int [] arr = new int[4];
        System.out.println(arr[5]);




    }

}
