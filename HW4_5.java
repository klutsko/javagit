package HW4;

public class HW4_5 {
    public static void main(String[] args) {



        int arr[][] = new int[8][5];

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


        }

    }
}
