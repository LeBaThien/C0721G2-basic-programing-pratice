package b4_class_and_object_java.exercise;

import java.util.Date;

public class StopWatch {
    private double startTime;
    private double endTime;

    public double getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public void setEndTime(double endTime) {
        this.endTime = endTime;
    }

    public StopWatch (double startTime, double endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }
    public void start() {
        this.startTime = System.currentTimeMillis();
    }
    public void  stop() {
       this.endTime = System.currentTimeMillis();
    }
    public double getElapsedTime(){
        return this.endTime -  this.startTime ;
    }



}
