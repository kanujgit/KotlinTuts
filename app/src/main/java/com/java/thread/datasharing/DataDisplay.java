package com.java.thread.datasharing;

import java.util.concurrent.BlockingQueue;

public class DataDisplay implements Runnable {

    private BlockingQueue<DataInfo> message;

    public DataDisplay(BlockingQueue<DataInfo> message) {
        this.message = message;
    }

    @Override
    public void run() {
        try {
            System.out.println("Please wait , data will coming soon");
            DataInfo info = message.take();
            System.out.println("Data details: \n  Name: " + info.name + " \n " + " Designation: " + info.designation);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
