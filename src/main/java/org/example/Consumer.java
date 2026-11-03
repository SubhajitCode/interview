package org.example;

import java.util.Random;

/**
 * Consumer
 */
public class Consumer {
    JobQueue jobQueue;

    Consumer(JobQueue jobQueue){
        this.jobQueue=jobQueue;
    }
    int counter =0;
    public void consume(){
      Job job = jobQueue.consume();
      process(job);

    }


    private void process(Job job){
        System.out.println(job.jobId + " "+ job.description);
    }
    // should keep some status with state pattern
    // should keep some retry count to compare with threashold
    // redis and db will be used for persistnace

}