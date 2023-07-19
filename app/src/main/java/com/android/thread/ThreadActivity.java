package com.android.thread;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.StrictMode;
import android.util.Log;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.kotlintuts.BuildConfig;
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
        editText = findViewById(R.id.edit_text);
        Log.d("TAG", editText.getHeight()+"");
        startService(new Intent(this, MyIntentService.class));



//        h1 = new Handler(Looper.getMainLooper()) {
//            @Override
//            public void handleMessage(@NonNull Message msg) {
//                bb = msg.getData();
//                String str = bb.getString("key");
//                editText.setText(str);
//                System.out.println(str);
//            }
//        };
//        t = new Thread(new MyRunnable(h1));
//        t.start();
//
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TAG", editText.getHeight()+"");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TAG", editText.getHeight()+"");
    }

    private void enableThreadPolicy(){
        if(BuildConfig.DEBUG){
            StrictMode.ThreadPolicy threadPolicy = new StrictMode.ThreadPolicy.Builder()
                    .detectAll().penaltyLog().build();
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
