package com.example.demo.service.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class AsyncService {
    @Async
    public void performTask(){
        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }
        System.out.println("Async task done and not returned anything.");
    }

    @Async
    public CompletableFuture<String> performAsyncTask(){
        try{
            System.out.println("Current thread: "+ Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("Async task completed and sent a gift!");
            return CompletableFuture.completedFuture("Async task completed (gift).");
        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }
        return CompletableFuture.completedFuture("Async task failed.");
    }
}
