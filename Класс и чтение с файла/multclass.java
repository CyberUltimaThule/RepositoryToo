package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

class multclass {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("multiplication.txt"))) {
            Scanner in = new Scanner(System.in);
            String str = br.readLine();
            String[] values = str.split("\\*");
            int numberA = Integer.parseInt(values[0]);
            int numberB = Integer.parseInt(values[1]);
            multip mult = new multip();
            System.out.println(mult.multip(numberA, numberB));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
class multip {
    static int multip(int numberA, int numberB) {
        if (numberA == 0 || numberB == 0) {
            return 0;
        } else if (numberA == 1) {
            return numberB;
        } else if (numberB == 1) {
            return numberA;
        } else {
            return (int) Math.pow(10, (Math.log10(numberA) + Math.log10(numberB)));
        }
    }
}