package com.telran.io;

import java.io.*;
import java.net.URL;

public class Example_3_Copy {

    public static void main(String[] args) throws IOException {
//        copy(
//                new URL("https://google.com").openStream(),
//                new FileOutputStream("google")
//        );

        copy(
                new FileInputStream("google.txt"),
                new FileOutputStream("my site.html")
        );

        // jpeg, gif, pdf, docx
        // first 10 bytes
    }

    private static void copy(InputStream is, OutputStream os) throws IOException {
        byte[] data = is.readAllBytes();
        is.close();

        os.write(data);
        os.flush();
        os.close();
    }

}
