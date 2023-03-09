package com.example.max.core.multithreading.counter;

public class Counter {
    private Integer value = 0;

    public Integer incrementAndGetValue() {
        return value++;
    }
}
