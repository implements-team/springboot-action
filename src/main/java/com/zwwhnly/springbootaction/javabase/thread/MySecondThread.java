package com.zwwhnly.springbootaction.javabase.thread;

public class MySecondThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.printf("[MySecondThread]输出:%d,当前线程名称:%s\n",
                    i, Thread.currentThread().getName());
        }
    }
}
