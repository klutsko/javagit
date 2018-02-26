package HW4;

public class HW4_2 {
    public static void main(String[] args) {


        int firstNumber = 1, secondNumber = 1;

        for(int i = 0; i<11; i++){

            if(i%2==0) {
                firstNumber = firstNumber+secondNumber;
                System.out.print(firstNumber+" ");
            } else {
                secondNumber = firstNumber+secondNumber;
                System.out.print(secondNumber+" ");
            }
        }


    }
}
