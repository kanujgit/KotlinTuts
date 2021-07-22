package com.kdroid.kotlintuts.java.thread.datasharing;

import java.util.concurrent.BlockingQueue;

public class DataRetrieving implements Runnable {

    private BlockingQueue<DataInfo> message;


    public DataRetrieving(BlockingQueue<DataInfo> message) {
        this.message = message;
    }

    @Override
    public void run() {
        DataInfo dataInfo;
        try {
            dataInfo = RetrieveData();
            message.put(dataInfo);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // suppose this is a very big task
    private DataInfo RetrieveData() throws InterruptedException {
        Thread.sleep(500);
        return new DataInfo("Anuj", "Software Engineer");
    }
}
