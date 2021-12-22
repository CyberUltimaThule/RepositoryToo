package com.company;

import java.util.Random;
import java.util.Scanner;

class Account extends Thread {
    int balance;
    private Scanner in = new Scanner(System.in);

    public void start() {
        System.out.println("Баланс:" + balance);
        System.out.println("Выберите нужную вам банковскую операцию");
        int bankoperation1 = in.nextInt();
        if (bankoperation1 == 1) {
            popolnenie();
        }

        if (bankoperation1 == 2) {
            snyatie();
        }
    }
    public Account(int balance) {
        this.balance = balance;
    }

    public void popolnenie() {
        System.out.println("Введите сумму для пополнения баланса");
        int summapopol = in.nextInt();
        balance += summapopol;
        System.out.println("Баланс,после пополнения:" + balance);
        start();
    }

    public void snyatie() {
        System.out.println("Вы хотите снять деньги со счёта. Введите нужную вам сумму");
        int snyat = in.nextInt();
        if (balance < snyat) {
            System.out.println("У вас недостаточно средств,пополните счёт,чтобы снять деньги!");
            popolnenie();
        }
        balance -= snyat;
        System.out.println("Баланс,после снятия:" + balance);
        }
    }

    class accountbank {
        public static void main(String[] args) {
            Random r = new Random();
            int balance2 = r.nextInt(1000000)+1;
            Account bank = new Account(balance2);
            bank.start();
        }
    }
