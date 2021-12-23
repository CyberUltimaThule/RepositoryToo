package ru.demo.downloadpicture;

import java.io.*;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.Scanner;

public class picture {

    private static final String PATH_TO_PICTURE = "src\\ru\\demo\\downloadpicture\\Picture.jpg";
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        System.out.println("Введите URL-ссылку для скачки. Например:" +
                "https://mobimg.b-cdn.net/v3/fetch/02/028d6a548cfa34926bc5d0849413e571.jpeg");
        URL url = new URL(in.nextLine());
        ReadableByteChannel byteChannel = Channels.newChannel(url.openStream());
        FileOutputStream stream = new FileOutputStream(PATH_TO_PICTURE);
        stream.getChannel().transferFrom(byteChannel, 0, Long.MAX_VALUE);
        stream.close();
        byteChannel.close();
    }}