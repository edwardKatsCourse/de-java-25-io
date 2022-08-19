package com.telran.io;

import java.io.*;
import java.util.Random;

public class Example_4_Try_With_Resources {


    public static void main(String[] args) {

        try(FileWriter fileWriter = new FileWriter("file2.txt");
            BufferedWriter writer = new BufferedWriter(fileWriter)) {


        } catch (IOException e) {
            e.printStackTrace();
        }

//        try(Abc abc = new Abc()) {
//
//            throw new RuntimeException();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }

}

class Abc implements AutoCloseable {


    @Override
    public void close() throws Exception {

        System.out.println("Abc -> close()");
    }
}
