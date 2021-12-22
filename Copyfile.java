package com.company;

import java.io.*;
import java.time.Duration;
import java.time.Instant;

class copyfiles {
    public static void main(String[] args) throws IOException, InterruptedException {
        File file1 = new File("aa.txt");
        File copyfile1 = new File("aacopy.txt");
        File file2 = new File("bb.txt");
        File copyfile2 = new File("bbcopy.txt");
        copyFile(file1, copyfile1);
        copyFile(file2, copyfile2);
        Instant start = Instant.now();
        Thread.sleep(1000);
        Instant finish = Instant.now();
        long elapsed = Duration.between(start, finish).toMillis();
        System.out.println("Время выполнения кода:" + elapsed + "мс");
    }

    private static void copyFile(File file1, File copyfile1) throws IOException {
        InputStream inputst = null;
        OutputStream outputst = null;
        try {
            inputst = new FileInputStream(file1);
            outputst = new FileOutputStream(copyfile1);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputst.read(buffer)) > 0) {
                outputst.write(buffer, 0, length);
            }
        } finally {
            inputst.close();
            outputst.close();
        }
    }
    }
