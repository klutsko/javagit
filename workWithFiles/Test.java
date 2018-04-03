package myownpractice;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        File file = new File(path + "/file.txt");

        String gap = "";


        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayList<String> names = new ArrayList<>();
       // long startTime = System.currentTimeMillis();
        getFiles(path, gap, file, names);
     //   long timeSpent = System.currentTimeMillis() - startTime;
      //  System.out.println(timeSpent);




    }

    public static void getFiles(String path, String gap, File file, ArrayList<String> names) throws IOException {

        FileWriter fileWriter = new FileWriter(file);
        File directory = new File(path);
        File[] files = directory.listFiles();
        for(File f : files){
            if(f.isFile()){
                Date date = new Date(f.lastModified());
                names.add(gap + f.getName() + " : " + date  + "\n");
            }
            else {
                String newGap = gap + " ";
                Date date = new Date(f.lastModified());
                names.add(newGap + f.getName() + " : " + date  + "\n");
                getFiles(f.getAbsolutePath(), newGap, file, names);
            }
        }
        for(String s : names){
            fileWriter.write(s);
        }
        fileWriter.close();


    }
}
