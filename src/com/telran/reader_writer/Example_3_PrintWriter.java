package com.telran.reader_writer;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Example_3_PrintWriter {

    public static void main(String[] args) throws IOException {
        PrintWriter printWriter = new PrintWriter( // decorator
                new FileWriter("file2.txt") // adapter
        );


        printWriter.println("hi");
        printWriter.println("my name is edward");
        printWriter.println("gb");



        printWriter.flush();
        printWriter.close();

        System.out.println();

        // Adapter    - OutputStream -> FileOutputStream
        // Decorator  - BufferedReader, PrintWriter
        //      String( char[]( byte[]) )
    }
}
