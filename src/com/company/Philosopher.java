package com.company;
import java.util.concurrent.Semaphore;

public class Philosopher extends Thread implements IThinkable, IEatable {

    private Semaphore semaphore = null;
    private String philosopherName = null;
    private PhilosopherState philosopherState = PhilosopherState.Hungry;

    public Philosopher(Semaphore sem, String philName){
        semaphore = sem;
        philosopherName = philName;
    }

    public void run()
    {
        try
        {
            if(philosopherState == PhilosopherState.Hungry){
                semaphore.acquire();
                System.out.println(philosopherName + " сел");

                eat();

                think();
            }
        }
        catch (InterruptedException exception){
            System.out.println("Something went wrong");
        }
    }

    @Override
    public void eat() throws InterruptedException {
        sleep(100);
        philosopherState = PhilosopherState.Full;
        semaphore.release();
        System.out.println(philosopherName + " поел");
    }

    @Override
    public void think() throws InterruptedException {
        System.out.println(philosopherName + " начал думать");
        sleep(100);
        philosopherState = PhilosopherState.Hungry;
    }
}
