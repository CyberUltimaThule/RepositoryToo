package com.company;

import java.util.Scanner;
import java.lang.Math;
import java.io.*;

public class readingfromafile {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("multiplication.txt"))) {
            Scanner in = new Scanner(System.in);
            String str = br.readLine();
            String[] values = str.split("\\*");
            int numberA = Integer.parseInt(values[0]);
            int numberB = Integer.parseInt(values[1]);
            System.out.print("\n" + Math.pow(10, (Math.log10(numberA) + Math.log10(numberB))));
            if (numberA == 0 || numberB == 0) {
                System.out.print(0);
            } else if (numberA == 1) {
                System.out.print(numberB);
            } else if (numberB == 1) {
                System.out.print(numberA);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}