package com.telran.reader_writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Example_2_Writer {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("file2.txt"));

        bufferedWriter.write("Hello from writer");
        bufferedWriter.newLine();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
