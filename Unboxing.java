package Lesson1;

public class Unboxing {


    public static void main(String[] args) {

        int i = 127;
        int in = 129;
        short sh = 44;
        char ch1 = 'h';

        byte b2 = (byte) in;

        System.out.println(b2);

        int x = 10;

        int y = x < i ? x : i;

        System.out.println(y);

        //boolean-exp ? value0 : value1


        int[][] numbers = {{1, 2}, {3,4},{5, 6}, };
        System.out.println(numbers[2][0]);


        byte c = (byte) i;
        System.out.println("unboxing int in byte: " + c);

        byte s = (byte) sh;
        System.out.println("unboxing short in byte: " + s);

        byte ch = (byte) ch1;
        System.out.println("unboxing char in byte: " + ch);

        short s2 = (short) i;
        System.out.println("unboxing int in short: " + ch);


    }


}
