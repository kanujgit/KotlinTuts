package com.android.thread;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import androidx.annotation.Nullable;

public class MyIntentService extends IntentService {

    public MyIntentService(String name) {
        super(name);
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.i("MyIntentService", "Handle intent");
        new MyThread().start();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("MyIntentService", "service created");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("MyIntentService", "service destroy");
    }

    class MyThread extends Thread{
        @Override
        public void run() {
            super.run();
            try {
                Log.i("MyIntentService", "thread start ");
                Thread.sleep(100*100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
