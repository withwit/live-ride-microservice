package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.UUID;
import java.util.concurrent.Executor;

@EnableAsync
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(String[] args) {
        return runner -> {
            System.out.println("Hello world!!! from Bean.");
            System.out.println(UUID.randomUUID().toString().substring(0, 10));
        };
    }

    @Bean
    //taskExecutor is the default that spring searches.
    //If we do not define an Executor bean, Spring creates a SimpleAsyncTaskExecutor and uses that.
    public Executor taskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
//        Core pool size is defines minimum paralel threads can run at same time. In our sample,
//        CORE_POOL_SIZE = 75 and this mean, our application can increase paralel running threads
//        up to 75. If our application need more thread over than 75, new threads will be added into queue.
        executor.setCorePoolSize(2);
//Maximum pool size defines maximum parallel threads can run at same time.
// In our sample MAX_POOL_SIZE = 100 and this mean, our application can be increase to 100 parallel running
// threads when queue is full.
        executor.setMaxPoolSize(10);
// Queue is using when all core pool are filled. Threads will be scalable to maximum pool
// size when queue is full. In our application, let’s imagine 75 threads running at same time
// and also 75 threads more in queue. Totally we have 150 threads. Pool size will be increased
// until maximum pool size for each thread over 150.
        executor.setQueueCapacity(500);
        executor.setThreadNamePrefix("CustomThread-");
        executor.initialize();
        return executor;

    }

}
