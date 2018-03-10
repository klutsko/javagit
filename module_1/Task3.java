package module.task1.task3;

public class Task3 {
    public static void main(String[] args) {


        int[] myArray = {3, 7, 1, 6, 6};
        System.out.println(countOfUniqueElements(myArray));



    }
    public static int countOfUniqueElements(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int count = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                count++;
            }

        }
        return count;
    }

}
