package HW4;

public class HW4_3 {
    public static void main(String[] args) {


        int number, firstPartOfDigit, secondPartOfDigit;// 1000 -  999999
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
        System.out.println("We need: " + countOfGifts + " gifts");


    }
}
