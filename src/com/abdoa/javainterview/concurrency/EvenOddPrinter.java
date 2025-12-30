package com.abdoa.javainterview.concurrency;

public class EvenOddPrinter {

    private int count = 1;
    private final int limit;
    private final Object lock = new Object();

    public EvenOddPrinter(int limit){
        this.limit = limit;
    }

    public void oddPrinter(){
        synchronized (lock){
            while(count <= limit){
                while(count%2 == 0){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                if(count<= limit){
                    System.out.println(Thread.currentThread().getName()+":"+count);
                    count++;
                    lock.notify();
                }
            }
        }

    }

    public void evenPrinter(){
        synchronized (lock){
            while(count <= limit){
                while(count%2 != 0){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                if(count<= limit){
                    System.out.println(Thread.currentThread().getName()+":"+count);
                    count++;
                    lock.notify();
                }

            }
        }

    }
}
