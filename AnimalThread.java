package com.company;
import java.lang.Thread;
import java.lang.String;

class AnimalThread extends Thread
{
    public static void main(String[] args){}
    String Animal;
    int Priority;
    public AnimalThread(String Animal, int Priority) {
        this.Priority = Priority;
        this.Animal = Animal;
    }


    @Override
    public void run() {
        int rasstoyanie = 10;
        Thread.currentThread().setName(Animal);
        for(int metri = 1;metri <= rasstoyanie; metri ++){
            try {
                Thread.sleep(20);
                System.out.println(Thread.currentThread().getName() + " пробежал(ла) " + metri + "метров");
            } catch (InterruptedException e) {
                e.printStackTrace();
    }
}}}
class RabbitAndTurtle {
    public static void main(String[] args) {
        AnimalThread rabbit = new AnimalThread("Кролик", Thread.MIN_PRIORITY);
        AnimalThread turtle = new AnimalThread("Черепаха", Thread.MAX_PRIORITY);
        rabbit.start();
        turtle.start();
    }
}
