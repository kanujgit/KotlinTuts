package com.java.thread.datasharing;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Topic: Data sharing between two thread
 * First Thread: DataRetrieving.java
 * Second Thread:DataDisplay.java
 */
public class DataShareDemo {
    public static void main(String[] args) {
        BlockingQueue<DataInfo> infoArrayBlockingQueue = new ArrayBlockingQueue<DataInfo>(1);
        DataRetrieving dataRetrieving = new DataRetrieving(infoArrayBlockingQueue);
        DataDisplay display = new DataDisplay(infoArrayBlockingQueue);
        new Thread(dataRetrieving).start();
        new Thread(display).start();
    }
}
