package com.abdoa.javainterview.concurrency;

public class EvenOddThreadDemo {

    static void main() {
        EvenOddPrinter printer = new EvenOddPrinter(100000);

        Thread odd = Thread.ofVirtual().name("Odd-Thread").start(printer::oddPrinter);
        Thread even = Thread.ofVirtual().name("Even-Thread").start(printer::evenPrinter);

        try {
            odd.join();
            even.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
