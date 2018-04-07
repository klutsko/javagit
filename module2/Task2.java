package module2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) {
        String csvFile = "/Users/kseniialutsko/Documents/class.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader myBR = new BufferedReader(new FileReader(csvFile))) {
            while ((line = myBR.readLine()) != null) {

                String[] data = line.split(cvsSplitBy);

                System.out.println("Data about class [class is= " + data[0] + " , count is= " + data[1]   +  ", name is=" + data[2]+"]");


            }
            myBR.close();


        } catch (IOException e) {
            e.printStackTrace();

    }

    }
}