package com.company;

import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.Duration;
import java.time.Instant;

class NIOcopyF {
    public static void main(String[] args) throws IOException, InterruptedException {
        File file1 = new File("aa.txt");
        File copyfile1 = new File("aacopy.txt");
        File file2 = new File("bb.txt");
        File copyfile2 = new File("bbcopy.txt");
        Instant start = Instant.now();
        Thread.sleep(1000);
        Instant finish = Instant.now();
        long elapsed = Duration.between(start, finish).toMillis();
        System.out.println("Время выполнения кода:" + elapsed + "мс");
        Path copied1 = Paths.get("aacopy.txt");
        Path originalPath1 = file1.toPath();
        Path copied2 = Paths.get("bbcopy.txt");
        Path originalPath2 = file2.toPath();
        Files.copy(originalPath1, copied1, StandardCopyOption.REPLACE_EXISTING);
        Files.copy(originalPath2, copied2, StandardCopyOption.REPLACE_EXISTING);
    }
}
