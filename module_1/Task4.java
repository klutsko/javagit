package module.task1.task4;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Task4 {

    public static void main(String[] args) throws IOException {
        {
            System.out.println(read("/Users/kseniialutsko/Documents/HW6.txt"));
        }

    }


    public static String read(String path)  {

        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader reader = null;
        try {

            reader = new BufferedReader(new FileReader(path));
            ArrayList<String> lines = new ArrayList<String>();
            String currentLine = reader.readLine();

            while (currentLine != null) {
                lines.add(currentLine);
                currentLine = reader.readLine();
                Collections.sort(lines);

                BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/kseniialutsko/Documents/HW6.txt"));
                for (String line : lines) {
                    writer.write(line);

                    writer.newLine();
                }
            }
                } catch(IOException e){
                    e.printStackTrace();
                } finally{
                    try {
                        reader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }


                return stringBuilder.toString();
            }
        }


