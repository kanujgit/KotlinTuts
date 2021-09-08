package com.android.handler;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.kotlintuts.databinding.ActivityMainBinding;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    private static final String IMAGE_URL = "https://lh3.googleusercontent.com/a-/AOh14Gh-Rsel1__HyQgCLFO4b54VtL46kjuePbTsebkxnpc=s576-p-rw-no";

    private static final int MSG_SHOW_PROGRESS = 1;
    private static final int MSG_SHOW_IMAGE = 2;
    private ProgressBar progressIndicator;
    private ImageView imageView;
    private Handler handler;


    private ActivityMainBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        progressIndicator = binding.prgBar;
        imageView = binding.img;

        handler = new UiHandler();

        final Thread workerThread = new Thread(new ImageFetcher(IMAGE_URL));
        workerThread.start();

    }

    class ImageFetcher extends Thread {
        final String imageUrl;

        ImageFetcher(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        @Override
        public void run() {
            handler.obtainMessage(MSG_SHOW_PROGRESS).sendToTarget();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            InputStream is = null;
            try {
                // Download image over the network
                URL url = new URL(imageUrl);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();

                conn.setRequestMethod("GET");
                conn.setDoInput(true);
                conn.connect();
                is = conn.getInputStream();

                // Decode the byte payload into a bitmap
                final Bitmap bitmap = BitmapFactory.decodeStream(is);
                handler.obtainMessage(MSG_SHOW_IMAGE, bitmap).sendToTarget();
            } catch (IOException ignore) {
            } finally {
                if (is != null) {
                    try {
                        is.close();
                    } catch (IOException ignore) {
                    }
                }
            }

        }
    }

    class UiHandler extends Handler {
        @Override
        public void handleMessage(@NonNull Message msg) {
            switch (msg.what) {
                case MSG_SHOW_PROGRESS: {
                    imageView.setVisibility(View.GONE);
                    progressIndicator.setVisibility(View.VISIBLE);
                    break;
                }
                case MSG_SHOW_IMAGE: {
                    progressIndicator.setVisibility(View.GONE);
                    imageView.setVisibility(View.VISIBLE);
                    imageView.setImageBitmap((Bitmap) msg.obj);
                    break;
                }
            }
        }
    }
}
