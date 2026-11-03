package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class JobQueue {
    private Queue<Job> jobQueue;
    JobQueue(){
        this.jobQueue=new LinkedList<>();
    }
    public void submit(Job job){
        jobQueue.add(job);
    }
    

    public Job consume(){
        return jobQueue.poll();
    }
    
}
