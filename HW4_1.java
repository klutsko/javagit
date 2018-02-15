package HW4;

import java.util.Scanner;

public class HW4_1 {
    public static void main(String[] args) {


        System.out.print("Enter some value: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();


        int sum = 0;
        int count = 0;
        int secondNumber = number;



        while (number != 0) {
            sum  += number % 10;
            number  /= 10;
            count++;

        }

        System.out.println("Sum of digits in value " + secondNumber + " = " + sum + ", count  is: " + count);


    }

}

