package com.company;

import java.util.Scanner;
import java.lang.Math;

public class readingfromtheconsole {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] values = in.nextLine().split("\\*");
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
    }
}