package Multithreading;

public class Job {
    private String name;
    private int sequence;
    private int priority;
    Job(){}
    Job(String name,int sequence,int priority){
        this.name=name;
        this.sequence=sequence;
        this.priority=priority;
    }
    public String getName() {
        return this.name;
    }
    public int getSequence() {
        return this.sequence;
    }
    public int getPriority(){
        return this.priority;
    }
}