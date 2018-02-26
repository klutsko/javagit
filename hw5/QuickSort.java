package hw5;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {8, 0, 4, 7, 3, 7, 10, 12, -3};
        System.out.println("WAS");
        System.out.println(Arrays.toString(array));

        int low = 0;
        int high = array.length - 1;

        quickSort(array, low, high);
        System.out.println("BECAME");
        System.out.println(Arrays.toString(array));
    }


    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;//finish if array.length equals 0

        if (low >= high)
            return;

        // знайти pivot
        int middle = low + (high - low) / 2;
        int pivot = array[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }

            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {//змінюємо місцями
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        // рекурсія для сортування лівої і правої частини
        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }


}
