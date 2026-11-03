package org.example;

public class Producer {
    JobQueue jobQueue ;
    int noOfTasks=
    Producer(JobQueue jobQueue){
        this.jobQueue=jobQueue;
    }
    int counter = 0;
    public void produce(){
          String jobId = String.valueOf(counter++);
        Job newJob = new Job(jobId, "New Job" + jobId);
        jobQueue.submit(newJob);
    }
    
}
