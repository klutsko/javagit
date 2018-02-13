package HW4;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {

        //1
      /*  System.out.print("Enter some value: ");
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
*/

        //2

     /*   int firstNumber = 1, secondNumber = 1;

        for(int i = 0; i<11; i++){

            if(i%2==0) {
                firstNumber = firstNumber+secondNumber;
                System.out.print(firstNumber+" ");
            } else {
                secondNumber = firstNumber+secondNumber;
                System.out.print(secondNumber+" ");
            }
        }*/

        //3

        /*int number, firstPartOfDigit, secondPartOfDigit;// 1000 -  999999
        int countOfGifts = 0;
        for (int i = 1000; i <= 999999; i++) {

            number = i / 1000; //for counting 1st part

            firstPartOfDigit = 0;
            secondPartOfDigit = 0;

            while (number != 0) {
                firstPartOfDigit = firstPartOfDigit + number % 10;
                number = number / 10;
            }
            number = i % 1000;//for counting 2nd part
            while (number != 0) {
                secondPartOfDigit = secondPartOfDigit + number % 10;
                number = number / 10;
            }
            if (firstPartOfDigit == secondPartOfDigit) {
                countOfGifts++;
            }
        }
        System.out.println("We need: " + countOfGifts + " gifts");*/


        //4


        /*int h1, h2, m1, m2;
        int hours = 0;
        int minutes = 0;
        int count = 0;

        while (hours < 24) {
            h1 = hours / 10;
            h2 = hours % 10;
            m1 = minutes / 10;
            m2 = minutes % 10;
            if (h1 == m1 && h2 == m2) {
                count++;
            }
            minutes++;
            if (minutes == 60) {
                minutes = 0;
                hours++;
            }
        }
        System.out.println("We can see the same combination: " + count + "times");
*/

        //5

      /*  int arr[][] = new int[8][5];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {  //j<arr[i].length = довжина 1го рядка =5
                arr[i][j] = (int) (Math.random() * 90 + 10); //0.0 до 1.0

            }

        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");


            }
            System.out.println();


        }*/

        //6
       /* int arr[][] = new int[7][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {  //j<arr[i].length = довжина 1го рядка =4
                arr[i][j] = (int) (Math.random() * 12 - 6); //-5 till 5


            }

        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");


            }
            System.out.println();


        }*/
    }

}

