package main;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{

        File file = new File("main.txt");

        if (!file.exists()) {
            file.createNewFile();
        }
        AboutFilm aboutFilm = new AboutFilm();
        String a =aboutFilm.text();

        FileWriter fileWriter= new FileWriter(file, false);
        BufferedWriter bufferedWriter =  new BufferedWriter(fileWriter);
        bufferedWriter.write(a.toString());
        bufferedWriter.close();


        FileReader fileReader = new FileReader(file);
        String line;
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while ((line = bufferedReader.readLine()) !=null) {
            System.out.println(line);
        }
        bufferedReader.close();

    }

}
