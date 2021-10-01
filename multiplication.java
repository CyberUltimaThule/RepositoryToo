package com.company;

import java.util.Scanner;
import java.lang.Math;

public class multiplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberA = in.nextInt();
        int numberB = in.nextInt();
        if (numberA == 0 || numberB == 0) {
        }
        System.out.print(Math.pow(10, (Math.log10(numberA) + Math.log10(numberB))));
        if (numberA == 0 || numberB == 0) {
            System.out.print(0);
        } else if (numberA == 1) {
            System.out.print(numberB);
        } else if (numberB == 1) {
            System.out.print(numberA);
        }
    }
}