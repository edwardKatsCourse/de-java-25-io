package com.telran.io;

import java.io.*;

public class Example_1_Read {

    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("file.txt");
        byte[] data = inputStream.readAllBytes();
        System.out.println(new String(data));

        inputStream.close();
    }

    private static void readByteBuffer() throws IOException {
        InputStream inputStream = new FileInputStream("file.txt");
        // 2MB
        byte[] buffer = new byte[inputStream.available()]; // 10 Kb


        // available = 100
        // buffer = 3
        // .read(buffer)
        //
        // available = 97
        while (inputStream.available() > 0) {
            // result = how many bytes were read
            /*int result = */inputStream.read(buffer);

        }

        System.out.println(new String(buffer));
    }

    private static void readByByte() throws IOException {
        // hello from notepad++
        InputStream inputStream = new FileInputStream("file.txt");
        while (true) {
            int data = inputStream.read();

            // 900 - a
            // 0 255
            // 1 1
            // 1 15
            // 1 255
            // 12 124
            // 255 255

            if (data == -1) {
                break;
            }

            System.out.println(new String(new byte[] {(byte)data}));

            // type coercion
            // short + byte = short
            // int + long = long
            // int + double = double
            // double + long = double
            // double + string + int = string

//            byte a = 9;
//            byte b = 12;

//            byte c = a + b;

            // int, double
        }
    }

}
