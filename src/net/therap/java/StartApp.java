package net.therap.java;

/**
 * Created with IntelliJ IDEA.
 * User: diptopol
 * Date: 8/1/13
 * Time: 1:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class StartApp {
    public static void main(String[] args) {
        Run runner = new Run();

        runner.runningSlow();
        runner.runningFast();
        runner.runningVeryFast();
    }
}
