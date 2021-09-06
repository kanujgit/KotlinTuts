package com.kdroid.kotlintuts.android.asynctask;

public class AsyncTaskDemo extends AsyncTask {


    public static void main(String[] args) {
        new AsyncTaskDemo().execute("www.google.com");
    }

    @Override
    protected void onPreExecuted() {
        showProgress();
    }

    @Override
    protected String doInBackground(String... mUrls) {
        for (String url : mUrls
        ) {
            publishProgress(url);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "SUCCESS";
    }

    @Override
    protected void onPostExecuted(String res) {
        hideProgress();
    }

    @Override
    protected void onProgressUpdate(String progress) {
        // update progress
    }


    public void showProgress() {

    }

    public void hideProgress() {

    }
}

