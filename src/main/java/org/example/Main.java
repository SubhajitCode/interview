package org.example;





/*

Design and implement an in-memory request processor that ensures a request with the same requestId is processed only once, even when multiple threads submit it simultaneously.

*/

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        JobQueue jobQueue = new JobQueue();
        Producer producer = new Producer(jobQueue);
        Consumer consumer= new Consumer(jobQueue);


            producer.produce();
            consumer.consume();


    }
}