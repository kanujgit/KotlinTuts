package com.kdroid.kotlintuts.android.asynctask;

import android.os.Handler;
import android.os.Looper;

public abstract class AsyncTask extends Thread {
    private final Handler handler;
    private String[] mUrls;

    public AsyncTask() {
        this.handler = new Handler(Looper.getMainLooper());
    }

    abstract protected void onPreExecuted();

    abstract protected String doInBackground(String... mUrls);

    abstract protected void onPostExecuted(String res);

    abstract protected void onProgressUpdate(String progress);

    protected void publishProgress(final String progress) {
        handler.post(new Runnable() {
            @Override
            public void run() {
                onProgressUpdate(progress);
            }
        });
    }

    protected void execute(String... mUrls) {
        this.mUrls = mUrls;
        // thread start
        start();
    }

    @Override
    public void run() {
        handler.post(new Runnable() {
            @Override
            public void run() {
                onPreExecuted();
            }
        });
        String results = null;
        try {
            results = doInBackground(mUrls);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            final String finalResults = results;
            handler.post(new Runnable() {
                @Override
                public void run() {
                    onPostExecuted(finalResults);
                }
            });
        }
    }
}
