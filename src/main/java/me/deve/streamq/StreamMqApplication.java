package me.deve.streamq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

@SpringBootApplication
public class StreamMqApplication {

    public static void main(String[] args) {
        SpringApplication.run(StreamMqApplication.class, args);

    }

}
