package com.company;
import java.lang.Thread;
import java.lang.String;

class EggChicken extends Thread {
    public static void main(String[] args){}
    String Animal;
    int Priority;
    public EggChicken(String Animal, int Priority) {
        this.Priority = Priority;
        this.Animal = Animal;
    }


    @Override
    public void run() {
        int spor = 10;
        Thread.currentThread().setName(Animal);
        for(int a = 1; a <= spor; a ++){
            try {
                Thread.sleep(100);
                System.out.println("Первым появилось(ась) " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class ChickenOrEgg {
    public static void main(String[] args) throws InterruptedException {
        EggChicken chicken = new EggChicken("Яйцо", Thread.MAX_PRIORITY);
        EggChicken egg = new EggChicken("Курица", Thread.MAX_PRIORITY);
        egg.start();
        chicken.start();
        egg.join();
        if (chicken.isAlive() == false) {
            chicken.join();
            System.out.println("Курица всё таки появилась первой..");
        }
        else {
            chicken.join();
            System.out.println("Яйцо всё таки появилось первым..");
        }
        }
    }