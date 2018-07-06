package com.atguigu.offline;

public class Consumer {
    public static void main(String[] args) {
        ConsumerThread ct = new ConsumerThread();
        ct.run();
    }
}
