package HW4;

public class HW4_6 {
    public static void main(String[] args) {



        int arr[][] = new int[7][4];

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


        }
    }
}
