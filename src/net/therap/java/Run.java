package net.therap.java;

/**
 * Created with IntelliJ IDEA.
 * User: diptopol
 * Date: 8/4/13
 * Time: 10:37 AM
 * To change this template use File | Settings | File Templates.
 */
public class Run {

    public void runningSlow() {
        try {
            Thread.sleep(3000);
            System.out.println("Method is running slow");
            Thread.sleep(3000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    void runningFast() {
        try {
            Thread.sleep(1000);
            System.out.println("Method is running fast");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    void runningVeryFast() {
        try {
            Thread.sleep(1000);
            System.out.println("Method is running very fast");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
