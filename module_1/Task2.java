package module.task1.task2;


import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        int answerFromLaptop;
        int answerFromUser = 0;
        int k = 5;

        do {
            System.out.println("Enter some value from 1 to 10");
            answerFromUser = sc.nextInt();
            answerFromLaptop = (int) (Math.random() * 10 + 1);


            if (answerFromLaptop != answerFromUser) {
                System.out.println("You didn't guess - value from Laptop is: " + answerFromLaptop);
                if (answerFromLaptop > answerFromUser) {
                    System.out.println("Value should be bigger!");
                } else {
                    System.out.println("Value should be smaller!");
                }
                k--;
                System.out.println("You have " + k + " times to guess");
                if (k == 0) {
                    break;
                }
            } else {
                System.out.println("You are correct! Congrats!");
            }

        }
        while (answerFromLaptop != answerFromUser);
    }


}










