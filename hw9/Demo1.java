package hw9;

import java.awt.font.TextLayout;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Demo1 {

    public static String read(String path) {
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader reader = null;
        try {

            reader = new BufferedReader(new FileReader(path));
            String currentString;

            while ((currentString = reader.readLine()) != null) {
                stringBuilder.append(currentString);
                stringBuilder.append("\n");
            }

            // reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


        return stringBuilder.toString();

    }


    public static void main(String[] args) {
        System.out.println(read("/Users/kseniialutsko/Documents/HW6.txt"));
    }
}


