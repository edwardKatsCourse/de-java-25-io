package com.telran.reader_writer;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Example_1_Reader {

    public static void main(String[] args) throws IOException {
        String firstName = getConsoleInput("Name: ");
        String text = getConsoleInput("Text: ");

        System.out.println();
        System.out.println();
        System.out.println(firstName + " commented: " + text);

    }

    private static String getConsoleInput(String caption) throws IOException {
        System.out.println(caption);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String line;
        StringBuilder builder = new StringBuilder();

        while (true) {
            line = bufferedReader.readLine();
            if (line == null || line.isBlank()) {
                break;
            }
            builder.append(line);
            builder.append("\n");
        }

        return builder.toString();
    }

    private static void readByLine() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("file.txt", StandardCharsets.UTF_8));
        String line;
//        while (true) {
//            String l = bufferedReader.readLine();
//            if (l == null) {
//                break;
//            }
//        }

        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }


        bufferedReader.close();
    }

    private static void readByChar() throws IOException {
        Reader reader = new FileReader("file.txt", StandardCharsets.UTF_8);

        while (true) {

            int data = reader.read();
            if (data == -1) {
                break;
            }
            System.out.println(new String(new char[] {(char) data}));
        }
    }

}
