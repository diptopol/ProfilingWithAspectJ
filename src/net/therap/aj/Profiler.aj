package net.therap.aj;

import java.util.Calendar;
import java.util.Date;

public aspect Profiler {
    long beforetime;
    long aftertime;

    pointcut profiling() : execution(*void net.therap.java.Run.*(..));

    /*before(): profiling() {

       beforetime = System.nanoTime();
    }


    after() returning: profiling() {

        aftertime = System.nanoTime();
        System.out.println("Running Time :"+(aftertime-beforetime));

    }*/

    Object around() :profiling() {
        beforetime = System.nanoTime();
        Object execution = proceed();

        aftertime = System.nanoTime();
        System.out.println("Around Running Time :"+(aftertime-beforetime));
        return execution;
    }


}