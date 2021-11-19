package com.android.thread;

import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ShareDataBetweenThread extends Fragment implements Handler.Callback {
    Handler backHandler1, backHandler2, mainHandler;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // thread 1
        HandlerThread backThread1 = new HandlerThread("BACK_THREAD_1");
        backThread1.start();
        backHandler1 = new Handler(backThread1.getLooper(), this);

        // thread 2
        HandlerThread backThread2 = new HandlerThread("BACK_THREAD_2");
        backThread2.start();
        backHandler2 = new Handler(backThread2.getLooper(), this);

        mainHandler = new Handler(Looper.getMainLooper(), this);
        // sending message from main thread to thread 1
        // backHandler1.obtainMessage(BACK1_WHAT, backObj).sendToTarget();


    }

    @Override
    public boolean handleMessage(@NonNull Message msg) {
        return true;
        //switch(msg.what){
//            case BACK1_WHAT:
//                // sending message to thread 2 from thread 1
//                backHandler2.obtainMessage(BACK2_WHAT, backObj1).sendToTarget();
//                return true;

    }
}
