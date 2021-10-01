package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultipTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    void testMultip() {
        int numberA = 4;
        int numberB = 4;
        Multip mult = new Multip();
        int value = mult.multip(numberA, numberB);
        assertEquals(16, value);
    }
}