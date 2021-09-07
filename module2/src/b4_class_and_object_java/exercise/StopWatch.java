package b4_class_and_object_java.exercise;

public class StopWatch {
    private int startTime;

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    private int endTime;

    public StopWatch (int startTime, int endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }
//    public int start() {
//
//    }
}
