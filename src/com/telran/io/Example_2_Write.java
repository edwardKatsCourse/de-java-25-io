package com.telran.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class Example_2_Write {

    public static void main(String[] args) throws IOException {
       while (true) {
           String firstName = getConsoleMessage("Name: ");
           String lastName = getConsoleMessage("Last name: ");
           String city = getConsoleMessage("City: ");

           String person = String.format("%s:%s:%s", firstName, lastName, city);
           write(person);

           String option = getConsoleMessage("Want another? Yes/No");
           if (option.equalsIgnoreCase("no")) {
               break;
           }
       }

        // write(byte[])
        // flush()
        // close()
    }

    private static void writeSimpleMessage() throws IOException {
        while (true) {
            String text = getConsoleMessage("Enter your message");
            if (text.equals("exit")) {
                break;
            }
            write(text);
        }
    }

    private static String getConsoleMessage(String caption) {
        System.out.println(caption);
        return new Scanner(System.in).nextLine();
    }

    private static void write(String message) throws IOException {
        OutputStream outputStream = new FileOutputStream("file2.txt", true);

        outputStream.write(message.getBytes());
        outputStream.write("\n".getBytes());
        outputStream.flush();
        outputStream.close();
    }
}
