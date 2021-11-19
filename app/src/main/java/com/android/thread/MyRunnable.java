package com.android.thread;


import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

public class MyRunnable implements Runnable {

    private final Handler h2;

    public MyRunnable(Handler h2) {
        this.h2 = h2;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            Message m = Message.obtain(); //get null message
            Bundle b = new Bundle();
            b.putString("key", "key");
            m.setData(b);
            h2.sendMessage(m);
        }
    }
}
