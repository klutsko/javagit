package module2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String csvFile = "/Users/kseniialutsko/Documents/class.csv";
        String line = "";
        String cvsSplitBy = ",";
        System.out.println("Enter data about class");
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();


        try (BufferedReader myBR = new BufferedReader(new FileReader(csvFile))) {

            while ((line = myBR.readLine()) != null) {


                String[] data = line.split(cvsSplitBy);
                showData(data, n);


            }
            myBR.close();


        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    public static void showData(String[] data, String sc) {
        for (int i = 0; i < data.length; i++) {
            if (sc.equals(data[i])) {
                System.out.println(data[i]);
                System.out.println("Data about class [class is= " + data[0] + " , count is= " + data[1] + ", name is=" + data[2] + "]");
            }  

        }
    }
}