package com.telran.io_helpers;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Example_1_File {

    public static void main(String[] args) throws IOException, InterruptedException {
//        File directory = new File("abc");
//        if (!directory.isDirectory() || !directory.exists()) {
//            directory.mkdir();
//        }
//
//        File myFile = new File(directory, "abc.txt");
//
//        if (!myFile.exists()) {
//            myFile.createNewFile();
//        }


        File directory = new File("abc");
        while (true) {
            var files = directory.listFiles();
            if (files.length != 0) {
                Arrays.stream(files)
                        .forEach(x -> deleteDirectoryOrFile(x));
            }
            Thread.sleep(2000);
        }
    }

    private static boolean deleteDirectoryOrFile(File directoryToBeDeleted) {
        File[] allContents = directoryToBeDeleted.listFiles();
        if (allContents != null) {
            for (File file : allContents) {
                deleteDirectoryOrFile(file);
            }
        }
        System.out.println(directoryToBeDeleted.getName());
        return directoryToBeDeleted.delete();
    }
}
