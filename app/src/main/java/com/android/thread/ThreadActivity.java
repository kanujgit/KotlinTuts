package com.android.thread;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.kotlintuts.R;

public class ThreadActivity extends Activity {

    Handler h1;
    Thread t;
    EditText editText;
    private Bundle bb = new Bundle();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thread);

        h1 = new Handler(Looper.getMainLooper()) {
            @Override
            public void handleMessage(@NonNull Message msg) {
                bb = msg.getData();
                String str = bb.getString("key");
                editText.setText(str);
                System.out.println(str);
            }
        };
        t = new Thread(new MyRunnable(h1));
        t.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
