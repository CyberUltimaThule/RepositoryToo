package com.company;

import java.lang.Math;

class Multip {
    public int multip(int numberA, int numberB) {
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